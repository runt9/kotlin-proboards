@Suppress("unused", "FunctionName")
external object EventUtility {
    // TODO: Find out what it calls the function with
    fun <T> on(event: String, callback: Function<T>)
    fun <T> one(event: String, callback: Function<T>)
}