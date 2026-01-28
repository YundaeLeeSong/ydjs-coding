/**
 * Defines the contract for a mutable configuration object.
 * <p>
 * This interface allows retrieval, modification, and deletion of configuration
 * settings, which are typically persisted to an underlying storage medium (like a file).
 * </p>
 *
 * @author Jaehoon Song
 * @version 1.0
 */
public interface Configuration {

    /**
     * Retrieves the value associated with the specified key.
     *
     * @param key the key whose associated value is to be returned.
     * @return the value to which the specified key is mapped, or {@code null}
     *         if this configuration contains no mapping for the key.
     */
    Object get(String key);

    /**
     * Checks if the configuration contains a mapping for the specified key.
     *
     * @param key the key whose presence in this configuration is to be tested.
     * @return {@code true} if this configuration contains a mapping for the specified key.
     */
    boolean has(String key);

    /**
     * Associates the specified value with the specified key in this configuration.
     * <p>
     * If the configuration previously contained a mapping for the key, the old
     * value is replaced. This operation triggers a synchronization with the
     * underlying storage.
     * </p>
     *
     * @param key   the key with which the specified value is to be associated.
     * @param value the value to be associated with the specified key.
     */
    void set(String key, Object value);

    /**
     * Removes the mapping for a key from this configuration if it is present.
     * <p>
     * This operation triggers a synchronization with the underlying storage.
     * </p>
     *
     * @param key the key whose mapping is to be removed from the configuration.
     */
    void remove(String key);

    /**
     * Completely removes the configuration data and deletes the underlying storage.
     * <p>
     * After calling this method, the configuration is empty, and the physical
     * file (if applicable) is deleted from the file system.
     * </p>
     */
    void clear();
}
