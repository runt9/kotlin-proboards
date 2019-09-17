@Suppress("unused", "FunctionName")
external object FormUtility {
    fun confirm_ignore_changes(selector: String)
    // TODO: Enum maybe?
    fun consolidate_params(options: List<String>? = definedExternally)
    fun gen_option_range(start: NumberUtility, end: NumberUtility, interval: NumberUtility? = definedExternally, selected: NumberUtility? = definedExternally): GenOptionRange
    fun <T> gen_verify_box(ID: String, title: String, height: String, width: String, text: String, verification_word: String, button_text: String, callback_success: Function<T>)
}

data class GenOptionRange(val value: NumberUtility, val text: NumberUtility)