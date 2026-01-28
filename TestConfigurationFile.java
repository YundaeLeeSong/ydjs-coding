import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

/**
 * JUnit tests for the {@link ConfigurationFile} implementation.
 * <p>
 * Verifies correct behavior for supported file formats (.properties, .yaml),
 * nested structure handling, and error conditions for unsupported extensions.
 * </p>
 *
 * @author Jaehoon Song
 * @version 1.0
 */
public class TestConfigurationFile {

    /**
     * Verifies lifecycle operations for a standard .properties file.
     * @throws IOException if an I/O error occurs.
     */
    @Test
    public void testPropertiesFormat() throws IOException {
        runLifecycleTest("config.properties");
    }

    /**
     * Verifies lifecycle operations for YAML files (.yaml, .yml).
     * @throws IOException if an I/O error occurs.
     */
    @Test
    public void testYamlFormat() throws IOException {
        runLifecycleTest("config.yaml");
        runLifecycleTest("config.yml");
    }

    /**
     * Verifies that nested YAML structures are correctly flattened into dot-notation keys
     * in memory, and correctly serialized back to nested YAML in the file.
     * @throws IOException if an I/O error occurs.
     */
    @Test
    public void testNestedYaml() throws IOException {
        Path tempDir = Files.createTempDirectory("Doe-test-yaml");
        Path configPath = tempDir.resolve("nested.yaml");

        Configuration config = new ConfigurationFile(configPath);

        // 1. Set nested keys using dot notation
        config.set("server.port", 8080);
        config.set("server.host", "localhost");
        config.set("app.name", "TestApp");

        // 2. Verify in-memory values
        assertEquals(8080, config.get("server.port"));
        assertEquals("localhost", config.get("server.host"));

        // 3. Verify toString() (prettyPrint) - Flat format
        String toStringOutput = config.toString();
        assertTrue(toStringOutput.contains("server.port: 8080"));
        assertTrue(toStringOutput.contains("server.host: localhost"));

        // 4. Verify file serialization - Nested format
        String fileContent = Files.readString(configPath);
        
        // We verify structural elements
        assertTrue(fileContent.contains("server:"));
        assertTrue(fileContent.contains("  port: 8080"));
        assertTrue(fileContent.contains("  host: localhost"));
        assertTrue(fileContent.contains("app:"));
        assertTrue(fileContent.contains("  name: TestApp"));
        
        // Ensure "server.port: 8080" does NOT exist (it should be nested)
        assertFalse(fileContent.contains("server.port:"));

        // 5. Cleanup
        config.clear();
        Files.deleteIfExists(tempDir);
    }

    @Test
    public void testMixedNodeThrowsException() throws IOException {
        Path tempDir = Files.createTempDirectory("Doe-test-mixed");
        Path configPath = tempDir.resolve("mixed.yaml");

        try {
            // server:
            //   host: 0.0.0.0
            //     port: 8080  <-- Error: host has value "0.0.0.0" AND child "port"
            String yamlContent = "server:\n  host: 0.0.0.0\n    port: 8080\n";
            Files.writeString(configPath, yamlContent);

            Configuration config = new ConfigurationFile(configPath);

            IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> {
                config.get("server.host"); // Trigger load
            });
            
            assertTrue(e.getMessage().contains("has a value but also has children"));
            
        } finally {
            Files.deleteIfExists(configPath);
            Files.deleteIfExists(tempDir);
        }
    }

    /**
     * Verifies that invalid indentation (dedent to a non-existent level) throws exception.
     * @throws IOException if an I/O error occurs.
     */
    @Test
    public void testInvalidIndentation() throws IOException {
        Path tempDir = Files.createTempDirectory("Doe-test-invalid-indent");
        Path configPath = tempDir.resolve("invalid_indent.yaml");

        try {
            // parent: (0)
            //     child: 1 (4)
            //   invalid: 2 (2) -> 2 < 4 but 2 is not in ancestors [0, 4]
            String yamlContent = "parent:\n    child: 1\n  invalid: 2\n";
            Files.writeString(configPath, yamlContent);

            Configuration config = new ConfigurationFile(configPath);
            
            // Should throw IllegalArgumentException
            IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> {
                config.get("parent"); // Trigger load
            });
            
            assertTrue(e.getMessage().contains("Invalid indentation"));
        } finally {
            Files.deleteIfExists(configPath);
            Files.deleteIfExists(tempDir);
        }
    }

    /**
     * Verifies that .env files are treated as properties files.
     * @throws IOException if an I/O error occurs.
     */
    @Test
    public void testEnvFormat() throws IOException {
        runLifecycleTest(".env"); // Special case: starts with dot
    }

    /**
     * Verifies that .ini files are REJECTED (as they typically use [] sections).
     * @throws IOException if an I/O error occurs.
     */
    @Test
    public void testExcludedFormatIni() throws IOException {
        runUnsupportedFormatTest("config.ini");
    }

    /**
     * Verifies that unsupported formats (like .json) throw an exception.
     * @throws IOException if an I/O error occurs.
     */
    @Test
    public void testUnsupportedFormatJson() throws IOException {
        runUnsupportedFormatTest("config.json");
    }

    /**
     * Helper to verify that an unsupported format throws IllegalArgumentException.
     * @param fileName the filename to test.
     * @throws IOException if an I/O error occurs during setup.
     */
    private void runUnsupportedFormatTest(String fileName) throws IOException {
        Path tempDir = Files.createTempDirectory("Doe-test-fail");
        Path configPath = tempDir.resolve(fileName);

        Configuration config = new ConfigurationFile(configPath);

        // Accessing the config triggers the load(), which should fail
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            config.set("key", "value");
        });

        assertTrue(exception.getMessage().contains("Unsupported file extension"));
        
        Files.deleteIfExists(tempDir);
    }

    /**
     * Helper to run a full lifecycle test (Create, Read, Verify File, Delete).
     * @param fileName the filename to test.
     * @throws IOException if an I/O error occurs.
     */
    private void runLifecycleTest(String fileName) throws IOException {
        Path tempDir = Files.createTempDirectory("Doe-test");
        Path configPath = tempDir.resolve(fileName);

        // 1. Create Proxy
        Configuration config = new ConfigurationFile(configPath);

        // 2. Set values
        config.set("name", "Doe");
        config.set("retries", 3);
        config.set("active", true);

        // 3. Verify in-memory
        assertEquals("Doe", config.get("name"));
        assertEquals(3, config.get("retries"));
        assertTrue((Boolean) config.get("active"));

        // 4. Verify file content format
        String content = Files.readString(configPath);
        
        boolean isYaml = fileName.endsWith(".yaml") || fileName.endsWith(".yml");
        
        if (isYaml) {
            // For simple top-level keys, YAML looks like "key: value"
            assertTrue(content.contains("name: Doe"));
            assertTrue(content.contains("retries: 3"));
        } else {
            // Properties style
            assertTrue(content.contains("name=Doe"));
            assertTrue(content.contains("retries=3"));
        }

        // 5. Cleanup
        config.clear();
        assertFalse(Files.exists(configPath));
        Files.deleteIfExists(tempDir);
    }
}