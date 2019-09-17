/**
 * The associated utility methods provide an easy interface to modifying the value of this key.
 *
 * A few general notes on these functions:
 *
 * Unless otherwise noted, all error functions will default to creating a proboards.error
 * dialog box with the error message and error code.
 * This is so that errors will be more obvious during the construction of code.
 *
 * If you're attempting to set the value of a plugin key that is not a super forum key,
 * and you do not supply an object_id, the setting functions will attempt to infer an object_id from the
 * page you're on. For example, on a post creation page, if you try to set an anonymous post key,
 * the object_id will be the id of the post you're creating.
 *
 * You can use any of these key functions that manipulate the data of a key on a key that is not
 * currently loaded onto the page, however the key's data will not become available to you
 * unless you use the set function.
 */
@Suppress("unused", "FunctionName", "EnumEntryName")
external class Key<T> {
    enum class SetOnHook { thread_new, post_new }

    /**
     * Concatenates a given value to the end of the existing key value.
     *
     * @param options Additional options
     */
    fun append(options: ModifyOptions<T>)

    /**
     * Check if the key can be read for the specified object_id.
     *
     * @param object_id The ID of the object to be checked.
     * @return True if the key can be read from for the specified object_id, false otherwise.
     */
    fun can_read(object_id: Number? = definedExternally): Boolean

    /**
     * Check if the key can be written to for the specified object_id.
     *
     * @param object_id The ID of the object to be checked.
     * @return True if the key can be written to from for the specified object_id, false otherwise.
     */
    fun can_write(object_id: Number? = definedExternally): Boolean

    /**
     * If the key is an integer, decreases the key's value by one,
     * or you can optionally supply a different amount to decrement by.
     *
     * @param options Additional options
     */
    fun decrement(options: NumericOptions? = definedExternally)

    /**
     * Returns the value associated with this plugin key for the passed-in object_id.
     *
     * @param object_id The ID of the object.
     * @return The value of this plugin key stored under this object_id.
     */
    fun get(object_id: Number? = definedExternally): T

    /**
     * If the key is an integer, increases the key's value by one,
     * or you can optionally supply a different amount to increment by.
     *
     * @param options Additional options
     */
    fun increment(options: NumericOptions? = definedExternally)

    /**
     * If the key is an array, removes the last options.num_items values and returns them.
     *
     * @param options Additional options
     * @return The last options.num_items values of the array, before they were removed.
     *  If multiple items are returned, they will be returned in an array.
     *  If popping from a key that is not loaded on the page, nothing will be returned.
     */
    fun pop(options: NumericOptions? = definedExternally): List<T>

    /**
     * Inserts a given value in front of the existing key value.
     *
     * @param options Additional options
     */
    fun prepend(options: ModifyOptions<T>)

    /**
     * If the key is an array, adds the given value to the back of the array.
     * You must supply either options.value or options.values.
     * If both are supplied, options.values will be ignored in favor of options.value.
     */
    fun push(options: PushUnshiftOptions<T>)

    /**
     * Sets the plugin key.
     *
     * @param options Additional Options
     */
    fun set(options: ModifyOptions<T>)

    /**
     * Triggers a plugin key to be set when a specific action occurs.
     *
     * @param hook The name of the action. Right now this is limited to 'thread_new' and 'post_new'.
     * @param object_id The ID of the object.
     * @param value The value to be assigned to this key.
     */
    fun set_on(hook: SetOnHook, object_id: Number? = definedExternally, value: T? = definedExternally)

    /**
     * If the key is an array, removes the first options.num_items values and returns them.
     *
     * @param options Additional options
     * @return The first options.num_items values of the array, before they were removed.
     * If multiple items are returned, they will be returned in an array.
     * If shifting from a key that is not loaded on the page, nothing will be returned.
     */
    fun shift(options: NumericOptions? = definedExternally): List<T>

    /**
     * Returns the type code of this plugin key. The reference function pb.plugin.key_types()
     * may be handy when used in conjunction with this function.
     *
     * @return The numeric code that represents this key type.
     */
    fun type(): Number

    /**
     * If the key is an array, adds the given value to the back of the array.
     * You must supply either options.value or options.values.
     * If both are supplied, options.values will be ignored in favor of options.value.
     */
    fun unshift(options: PushUnshiftOptions<T>)
}

/**
 * @param object_id The ID of the object.
 * @param value The value to be used for modification
 * @param success The success callback function.
 * @param error The error callback function.
 * @param complete The complete callback function.
 */
data class ModifyOptions<T>(
    val object_id: Number? = undefined,
    val value: T,
    val success: Function<*>? = undefined,
    val error: Function<*>? = undefined,
    val complete: Function<*>? = undefined
)

/**
 * @param object_id The ID of the object.
 * @param value The amount for the numeric action, defaulted to 1
 * @param success The success callback function.
 * @param error The error callback function.
 * @param complete The complete callback function.
 */
data class NumericOptions(
    val object_id: Number? = undefined,
    val value: Number? = 1,
    val success: Function<*>? = undefined,
    val error: Function<*>? = undefined,
    val complete: Function<*>? = undefined
)

/**
 * @param object_id The ID of the object.
 * @param value The value to be pushed onto the array.
 * @param values An array of values to be pushed onto the array.
 * @param success The success callback function.
 * @param error The error callback function.
 * @param complete The complete callback function.
 */
data class PushUnshiftOptions<T>(
    val object_id: Number? = undefined,
    val value: T? = undefined,
    val values: List<T>? = undefined,
    val success: Function<*>? = undefined,
    val error: Function<*>? = undefined,
    val complete: Function<*>? = undefined
)