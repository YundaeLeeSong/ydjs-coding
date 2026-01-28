import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * A file-based implementation of the {@link Configuration} interface.
 * <p>
 * This class acts as a proxy to a thread-safe, synchronized storage mechanism.
 * It supports automatic loading and saving of configuration data to files
 * with supported extensions.
 * </p>
 * <p>
 * <b>Supported Extensions:</b>
 * <ul>
 *   <li><b>Properties-style (key=value):</b> .properties, .env</li>
 *   <li><b>YAML-style (key: value, nested):</b> .yaml, .yml</li>
 * </ul>
 * </p>
 * <p>
 * <b>Note on YAML:</b> This implementation supports a subset of YAML. It handles
 * nested structures (indentation) by flattening them into dot-notation keys
 * (e.g., {@code server: { port: 8080 }} becomes {@code server.port=8080}).
 * </p>
 *
 * @author Jaehoon Song
 * @version 1.0
 */
public class ConfigurationFile implements Configuration {

    private final Path path;
    private volatile Storage realStorage;

    /**
     * Creates a new ConfigurationFile instance backed by the specified path.
     * <p>
     * The file is lazily loaded or created upon the first access operation.
     * </p>
     *
     * @param path the file system path to the configuration file.
     */
    public ConfigurationFile(Path path) {
        this.path = path;
    }

    /**
     * Lazily initializes the underlying storage mechanism using double-checked locking.
     *
     * @return the initialized {@link Storage} instance.
     */
    private Storage load() {
        if (realStorage == null) {
            synchronized (this) {
                if (realStorage == null) {
                    realStorage = new Storage(path);
                }
            }
        }
        return realStorage;
    }

    @Override
    public Object get(String key) {
        return load().get(key);
    }

    @Override
    public boolean has(String key) {
        return load().has(key);
    }

    @Override
    public void set(String key, Object value) {
        load().set(key, value);
    }

    @Override
    public void remove(String key) {
        load().remove(key);
    }

    @Override
    public void clear() {
        load().clear();
    }

    @Override
    public String toString() {
        return load().toString();
    }

    // --- Inner Classes ---

    /**
     * Private implementation of the configuration storage.
     * <p>
     * This class handles the actual file I/O, parsing, and in-memory data management.
     * It synchronizes all access to ensure thread safety.
     * </p>
     */
    private static class Storage implements Configuration {
        private final Path path;
        private final Map<String, Object> data;
        private final ConfigFormat format;

        /**
         * Initializes the storage, resolves the format strategy, and loads data.
         *
         * @param path the path to the configuration file.
         */
        Storage(Path path) {
            this.path = path;
            this.format = ConfigFormat.resolve(path);
            // Use LinkedHashMap to preserve insertion order where possible
            this.data = new LinkedHashMap<>();
            synchronized (this) {
                load();
            }
        }

        /**
         * Loads configuration data from the file.
         * If the file does not exist, it creates an empty file.
         */
        private void load() {
            if (!Files.exists(path)) {
                try {
                    if (path.getParent() != null) {
                        Files.createDirectories(path.getParent());
                    }
                    Files.createFile(path);
                } catch (IOException e) {
                    throw new RuntimeException("Failed to create config file", e);
                }
                return;
            }

            try {
                List<String> lines = Files.readAllLines(path);
                this.data.clear();
                this.data.putAll(format.parse(lines));
            } catch (IOException e) {
                throw new RuntimeException("Failed to load configuration", e);
            }
        }

        /**
         * Serializes the current data and writes it to the file.
         */
        private void save() {
            String content = format.serialize(data);
            try {
                Files.write(path, content.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            } catch (IOException e) {
                throw new RuntimeException("Failed to save configuration", e);
            }
        }

        @Override
        public synchronized Object get(String key) {
            return data.get(key);
        }

        @Override
        public synchronized boolean has(String key) {
            return data.containsKey(key);
        }

        @Override
        public synchronized void set(String key, Object value) {
            data.put(key, value);
            save();
        }

        @Override
        public synchronized void remove(String key) {
            data.remove(key);
            save();
        }

        @Override
        public synchronized void clear() {
            data.clear();
            try {
                Files.deleteIfExists(path);
            } catch (IOException e) {
                throw new RuntimeException("Failed to delete config file", e);
            }
        }

        @Override
        public synchronized String toString() {
            return format.getStringOf(data);
        }
    }

    /**
     * Strategy interface for parsing and serializing different configuration file types.
     */
    private interface ConfigFormat {
        
        Set<String> PROPERTIES_EXT = Set.of(".properties", ".env");
        Set<String> YAML_EXT = Set.of(".yaml", ".yml");

        /**
         * Parses a list of lines into a key-value map.
         *
         * @param lines the lines from the configuration file.
         * @return a map containing the parsed configuration data.
         */
        Map<String, Object> parse(List<String> lines);

        /**
         * Serializes a key-value map into a string suitable for writing to a file.
         *
         * @param data the configuration data map.
         * @return the serialized string.
         */
        String serialize(Map<String, Object> data);
        
        /**
         * Returns a human-readable string representation of the data (e.g., for logging).
         * This usually represents the "flattened" view of the data.
         *
         * @param data the configuration data map.
         * @return the pretty-printed string.
         */
        String getStringOf(Map<String, Object> data);

        /**
         * Resolves the appropriate {@link ConfigFormat} based on the file extension.
         *
         * @param path the path to the configuration file.
         * @return the compatible format strategy.
         * @throws IllegalArgumentException if the file extension is not supported.
         */
        static ConfigFormat resolve(Path path) {
            String fileName = path.getFileName().toString().toLowerCase();
            int dotIndex = fileName.lastIndexOf('.');
            if (dotIndex == -1) {
                 throw new IllegalArgumentException("File has no extension: " + fileName);
            }
            String ext = fileName.substring(dotIndex);

            if (PROPERTIES_EXT.contains(ext)) {
                return new PropertiesFormat();
            } else if (YAML_EXT.contains(ext)) {
                return new YamlFormat();
            } else {
                throw new IllegalArgumentException("Unsupported file extension: " + fileName);
            }
        }

        /**
         * Helper method to parse string values into their appropriate types.
         *
         * @param raw the raw string value.
         * @return Boolean, Integer, Double, or String.
         */
        static Object parseValue(String raw) {
            if (raw.equalsIgnoreCase("true") || raw.equalsIgnoreCase("false")) {
                return Boolean.parseBoolean(raw);
            }
            try {
                return Integer.parseInt(raw);
            } catch (NumberFormatException ignored) {}
            try {
                return Double.parseDouble(raw);
            } catch (NumberFormatException ignored) {}
            return raw;
        }
    }

    /**
     * Strategy implementation for standard Java Properties files (key=value).
     */
    private static class PropertiesFormat implements ConfigFormat {
        @Override
        public Map<String, Object> parse(List<String> lines) {
            Map<String, Object> map = new LinkedHashMap<>();
            for (String line : lines) {
                String trimmed = line.trim();
                if (trimmed.isEmpty() || trimmed.startsWith("#")) continue;
                int idx = trimmed.indexOf('=');
                if (idx < 0) continue;
                map.put(trimmed.substring(0, idx).trim(), ConfigFormat.parseValue(trimmed.substring(idx + 1).trim()));
            }
            return map;
        }

        @Override
        public String serialize(Map<String, Object> data) {
            return data.entrySet().stream()
                    .map(e -> e.getKey() + "=" + e.getValue())
                    .collect(Collectors.joining(System.lineSeparator()));
        }

        @Override
        public String getStringOf(Map<String, Object> data) {
            return serialize(data);
        }
    }

    /**
     * Strategy implementation for subset of YAML (key: value), supporting nested structures.
     */
    private static class YamlFormat implements ConfigFormat {
        
        @Override
        public Map<String, Object> parse(List<String> lines) {
            Map<String, Object> map = new LinkedHashMap<>();
            List<String> context = new ArrayList<>();
            List<Integer> indentLevels = new ArrayList<>();
            indentLevels.add(-1); // Sentinel

            for (String line : lines) {
                if (line.trim().isEmpty() || line.trim().startsWith("#")) continue;

                int indent = 0;
                while (indent < line.length() && line.charAt(indent) == ' ') {
                    indent++;
                }

                String trimmed = line.trim();
                int colonIdx = trimmed.indexOf(':');
                if (colonIdx < 0) continue; 

                String keyPart = trimmed.substring(0, colonIdx).trim();
                String valuePart = trimmed.substring(colonIdx + 1).trim();

                int lastIndent = indentLevels.get(indentLevels.size() - 1);
                if (indent < lastIndent && !indentLevels.contains(indent)) {
                    throw new IllegalArgumentException("Invalid indentation level: " + indent);
                }

                // Pop context until we match the current indentation level
                while (indentLevels.size() > 1 && indent <= indentLevels.get(indentLevels.size() - 1)) {
                    indentLevels.remove(indentLevels.size() - 1);
                    context.remove(context.size() - 1);
                }

                // Check if the parent node already has a value (leaf node cannot be a parent)
                if (!context.isEmpty()) {
                    String parentKey = String.join(".", context);
                    if (map.containsKey(parentKey)) {
                        throw new IllegalArgumentException("Configuration key '" + parentKey + "' has a value but also has children");
                    }
                }

                String fullKey = context.isEmpty() 
                    ? keyPart 
                    : String.join(".", context) + "." + keyPart;

                if (!valuePart.isEmpty()) {
                    map.put(fullKey, ConfigFormat.parseValue(valuePart));
                }
                
                context.add(keyPart);
                indentLevels.add(indent);
            }
            return map;
        }

        @Override
        public String serialize(Map<String, Object> data) {
            // Use TreeMap to sort keys naturally, ensuring parents and siblings are grouped
            Map<String, Object> sortedData = new TreeMap<>(data);
            StringBuilder sb = new StringBuilder();
            
            String[] lastParts = new String[0];

            for (Map.Entry<String, Object> entry : sortedData.entrySet()) {
                String[] currentParts = entry.getKey().split("\\.");
                
                // Calculate how much of the path is shared with the previous key
                int commonPrefix = 0;
                int minLen = Math.min(lastParts.length, currentParts.length);
                while (commonPrefix < minLen && lastParts[commonPrefix].equals(currentParts[commonPrefix])) {
                    commonPrefix++;
                }

                // Write only the new parts of the path
                for (int i = commonPrefix; i < currentParts.length; i++) {
                    int indent = i * 2;
                    sb.append(" ".repeat(indent));
                    sb.append(currentParts[i]);
                    
                    if (i == currentParts.length - 1) {
                        // Leaf node
                        sb.append(": ").append(entry.getValue()).append(System.lineSeparator());
                    } else {
                        // Parent node
                        sb.append(":").append(System.lineSeparator());
                    }
                }
                lastParts = currentParts;
            }
            return sb.toString().trim();
        }

        @Override
        public String getStringOf(Map<String, Object> data) {
            // Display flattened keys for internal string representation
            return data.entrySet().stream()
                    .map(e -> e.getKey() + ": " + e.getValue())
                    .collect(Collectors.joining(System.lineSeparator()));
        }
    }
}