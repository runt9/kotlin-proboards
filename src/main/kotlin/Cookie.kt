import kotlin.js.Date

@Suppress("unused", "FunctionName")
external class Cookie<T> {
    fun get(): T
    fun set(value: T, options: CookieOptions? = definedExternally): String
}

data class CookieOptions(val expires: Date?, val path: String?, val domain: String?, val secure: Boolean?)
