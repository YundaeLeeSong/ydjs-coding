/**
INSTRUCTIONS: 
    The Algorithm class contains recursive methods for several algorithmic problems.
    It includes methods to compute factorial, count bunny ears, calculate Fibonacci numbers,
    sum the digits of a number, count occurrences of the digit 8 (with special counting rules),
    and compute exponentiation recursively.

COMPILE & EXECUTE & CLEANUP (Java):

     javac  -d out              Configuration*.java
     java           -cp out     ConfigurationFileMain
     rm -rf out/
     












 */

import java.lang.*;         // <----------- implicitly by JVM (java)
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Demonstration class for the {@link ConfigurationFile} implementation.
 * <p>
 * This class showcases the usage of the configuration system with different
 * file formats (.properties and .yaml), demonstrating persistence,
 * nested structure handling, and error management.
 * </p>
 *
 * @author Jaehoon Song
 * @version 1.0
 */
public class ConfigurationFileMain {

    /**
     * Main entry point for the demonstration.
     *
     * @param args command line arguments (unused).
     */
    public static void main(String[] args) {
        System.out.println("=== Configuration System Demo ===\n");

        Path demoDir = Paths.get("demo_config");
        
        try {
            // Ensure demo directory exists
            Files.createDirectories(demoDir);

            // 1. Demonstrate Properties File Usage
            demoProperties(demoDir.resolve("app.properties"));

            System.out.println("\n--------------------------------------------------\n");

            // 2. Demonstrate YAML File Usage (Nested vs Flat)
            demoYaml(demoDir.resolve("app.yaml"));

            System.out.println("\n--------------------------------------------------\n");

            // 3. Demonstrate Error Handling
            demoUnsupportedFormat(demoDir.resolve("app.json"));

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Cleanup demo directory if empty
            try {
                Files.deleteIfExists(demoDir);
            } catch (IOException ignored) {}
        }
    }

    /**
     * Demonstrates usage with a standard properties file.
     *
     * @param path path to the .properties file.
     * @throws IOException if an I/O error occurs.
     */
    private static void demoProperties(Path path) throws IOException {
        System.out.println(">>> Demo: Properties File (" + path.getFileName() + ") <<<");

        Configuration config = new ConfigurationFile(path);

        // A. Setting values
        System.out.println("[Action] Setting values...");
        config.set("app.name", "JaehoonSong");
        config.set("app.version", 2);
        config.set("db.host", "localhost");

        // B. toString() Representation
        System.out.println("[Check] System.out.println(config) [In-Memory View, parsed]:");
        System.out.println(config);

        // C. File Content
        System.out.println("\n[Check] Actual File Content [Serialized View]:");
        System.out.println("--- START ---");
        System.out.println(Files.readString(path).trim());
        System.out.println("--- END ---");

        // D. Modifying values
        System.out.println("\n[Action] Updating app.version to 3...");
        config.set("app.version", 3);
        System.out.println("New value of app.version: " + config.get("app.version"));

        // // Cleanup
        // config.clear();
    }

    /**
     * Demonstrates usage with a YAML file, highlighting the difference
     * between the flat in-memory representation and the nested file storage.
     *
     * @param path path to the .yaml file.
     * @throws IOException if an I/O error occurs.
     */
    private static void demoYaml(Path path) throws IOException {
        System.out.println(">>> Demo: YAML File (" + path.getFileName() + ") <<<");


        Configuration config = new ConfigurationFile(path);

        // A. Setting values (using dot notation for hierarchy)
        System.out.println("[Action] Setting nested values...");
        config.set("server.port", 8080);
        config.set("server.host", "0.0.0.0");
        config.set("log.level", "DEBUG");
        config.set("log.file", "/var/log/app.log");

        // B. toString() Representation (Should be FLAT)
        System.out.println("[Check] System.out.println(config) [In-Memory View, parsed]:");
        System.out.println(config.toString());

        // C. File Content (Should be NESTED)
        System.out.println("\n[Check] Actual File Content [Serialized View]:");
        System.out.println("--- START ---");
        System.out.println(Files.readString(path).trim());
        System.out.println("--- END ---");


        // // Cleanup
        // config.clear();
    }

    /**
     * Demonstrates error handling for unsupported file extensions.
     *
     * @param path path to a file with an unsupported extension (e.g., .json).
     */
    private static void demoUnsupportedFormat(Path path) {
        System.out.println(">>> Demo: Unsupported Format (" + path.getFileName() + ") <<<");

        try {
            System.out.println("[Action] Attempting to create configuration for .json file...");
            Configuration config = new ConfigurationFile(path); 
            // Trigger load
            config.set("test", "value"); 

        } catch (IllegalArgumentException e) {
            System.out.println("[Success] Caught expected exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("[Failure] Caught unexpected exception: " + e);
        }
    }
}
