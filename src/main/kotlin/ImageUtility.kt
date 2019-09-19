/**
 * Contains utility functions for dealing with images.
 */
@Suppress("unused", "FunctionName")
external object ImageUtility {
    /**
     * Determines whether or not a given URL is a valid image path.
     *
     * @param URL The URL to check.
     * @return True means the given URL is valid, false means it's not.
     */
    fun is_valid_url(URL: String): Boolean

    /**
     * Preloads images into the page.
     *
     * @param images An array of URL strings to preload.
     */
    fun preload(images: List<String>)
}