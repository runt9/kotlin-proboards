/**
 * Contains utility functions for dealing with plugins.
 */
@Suppress("unused", "FunctionName")
external class PluginUtility {
    /**
     * Returns the plugin object with this name.
     * Currently this object is just the settings that the plugin author has defined for this plugin.
     *
     * @param name The name of the plugin to retrieve.
     * @return The author-defined settings for this plugin.
     */
    fun get(name: String): Plugin?

    /**
     * Returns a handle to the plugin key object with the given key.
     *
     * @param key The identifying string for this key.
     * @return The plugin key with the passed-in key name.
     */
    fun <T> key(key: String): Key<T>?

    /**
     * Returns a reference object with all plugin key types listed.
     *
     * @return A list of all plugin key types mapped to their key_type code.
     */
    fun key_types(): Map<String, NumberUtility>

    /**
     * Returns a reference object with all plugin status codes listed.
     *
     * @return A list of all plugin statuses mapped to their plugin_status code.
     */
    fun status_codes(): Map<String, NumberUtility>
}

data class Plugin(val version: String, val settings: Map<String, Any>)