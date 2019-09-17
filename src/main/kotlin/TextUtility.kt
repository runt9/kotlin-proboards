/**
 * Contains utility functions for dealing with text.
 */
@Suppress("unused", "FunctionName")
external object TextUtility {
    /**
     * Capitalizes the first character of a string.
     *
     * @param text The string to capitalize.
     * @return The capitalized string.
     */
    fun capitalize(text: String): String

    /**
     * Replaces the following characters with their HTML entity counterparts: &, <, >, ", '.
     *
     * @param text The string to modify.
     * @return The modified string.
     */
    fun escape_html(text: String): String

    /**
     * Replaces tabs, spaces, &, <, >, ", and ' with their HTML entity counterparts and newlines with linebreak HTML tags.
     *
     * @param text The string to modify.
     * @return The modified string.
     */
    fun mono(text: String): String

    /**
     * Formats tabs and spaces into HTML that will display as intended.
     *
     * @param text The string to modify.
     * @return The modified string.
     */
    fun nbsp(text: String): String

    /**
     * Replaces newlines with linebreak HTML tags.
     *
     * @param text The string to modify.
     * @return The modified string.
     */
    fun nl2br(text: String): String

    /**
     * Strips invalid UTF-16 surrogate pairs.
     *
     * @param text The string to validate.
     * @return The validated string.
     */
    fun validate_unicode(text: String): String
}