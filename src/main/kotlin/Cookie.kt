import kotlin.js.Date

/**
 * Contains utility functions for handling the cookie with the given key.
 */
@Suppress("unused", "FunctionName")
external class Cookie<T> {
    /**
     * @return The value in this cookie.
     */
    fun get(): T

    /**
     * Sets the value of this cookie.
     *
     * @param value The value to which to set this cookie.
     * @param options Additional options
     */
    fun set(value: T, options: CookieOptions? = definedExternally): String
}

/**
 * @param expires Must be either the string 'never', a number of days, or a JavaScript Date object.
 * @param path The cookie's path.
 * @param domain The cookie's domain.
 * @param secure True means the cookie will be marked 'secure'.
 */
data class CookieOptions(
    val expires: Date? = undefined,
    val path: String? = undefined,
    val domain: String? = undefined,
    val secure: Boolean = false
)
