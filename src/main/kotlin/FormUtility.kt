/**
 * Contains utility functions for dealing with forms.
 */
@Suppress("unused", "FunctionName", "EnumEntryName")
external object FormUtility {
    enum class ConsolidateParam { search, route, hash }

    /**
     * Adds one or more forms to the list of forms for which to confirm changes on exit.
     *
     * @param selector A jQuery selector that determines which form(s) to add.
     */
    fun confirm_ignore_changes(selector: String)

    /**
     * This will examine the location.search string, route parameters, and the location.hash string.
     * It will combine the parameters together. You can specify what you want to combine and the order.
     * If nothing is specified it will default to ['search', 'route', 'hash'].
     *
     * Keep in mind that array type parameters are taken from the last item in the array.
     * So if search has an array type parameter of filters[] and then you want to consolidate the hash parameters
     * (hash params must exist), the previous filter params from search are completely ignored.
     *
     * In the default scenario, route params gets merged into search and then hash params are merged into search.
     *
     * @param options An array consisting of a permutation of ['search', 'route', 'hash']
     * @return The combined params object.
     */
    fun consolidate_params(options: List<ConsolidateParam>? = definedExternally): Map<String, Any>

    /**
     * Generates a range of number options used when generating a select input.
     *
     * @param start Starting number.
     * @param end Ending number.
     * @param interval The interval between options.
     * @param selected The option that should be selected by default.
     * @return An array of objects, each with text and value fields. If the selected options was specified, one of the options will have a selected field set to true.
     */
    fun gen_option_range(
        start: Number,
        end: Number,
        interval: Number? = definedExternally,
        selected: Number? = definedExternally
    ): List<GenOptionRange>

    /**
     * Builds a dialog with variable text and a verification input field.
     *
     * @param ID The ID of selection dialog.
     * @param title The title of selection dialog.
     * @param height The height of selection dialog.
     * @param width The width of selection dialog.
     * @param text The text to insert into selection dialog.
     * @param verification_word The word users will type to acknowledge the change.
     * @param button_text The text of the submit button.
     * @param callback_success The function to be called when action has been verified successfully.
     */
    fun <T> gen_verify_box(
        ID: String,
        title: String,
        height: String,
        width: String,
        text: String,
        verification_word: String,
        button_text: String,
        callback_success: Function<T>
    )
}

/**
 * @param value Numeric value of the number returned in the range
 * @param text String value of the same number
 */
data class GenOptionRange(val value: Number, val text: String)