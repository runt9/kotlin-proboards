@Suppress("unused", "FunctionName")
external object ImageUtility {
    fun is_valid_url(URL: String): Boolean
    fun preload(images: List<String>)
}