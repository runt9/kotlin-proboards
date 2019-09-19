/**
 * Contains utility functions for dealing with boards.
 */
@Suppress("unused", "FunctionName")
external object BoardUtility {
    /**
     * Loads a board selection list in a dialog and calls a return function on finish.
     * Note that the dialog will always be regenerated unless useExisting is true.
     * The three parameters of the callback function are listed here for clarity,
     * but are not passed in manually when the select function is initially called.
     * Note: Only admins will be able to access this function.
     *
     * @param options Additional options
     * @param callback Function to call when a board has been selected. This function receives 3 arguments
     *  (these params are provided to the callback function automatically, and cannot be passed in here)
     * @param board_id If multiSelect is false, the board id. If multiSelect is true, a comma-separated list of board ids.
     * @param board_name If multiSelect is false, the board name. If multiSelect is true, a comma-separated list of board names.
     * @param remember Passed along from the value of the remember option.
     */
    fun select(options: BoardSelectOptions? = definedExternally, callback: Function<*>, board_id: String, board_name: String, remember: Boolean)
}

/**
 * @param id The id you want to give to the select dialog.
 * @param multiSelect If true, allows selecting multiple boards.
 * @param useExisting If true, then calling this function with an id that already has a dialog will open that dialog.
 * @param accessible If true, the dialog will only show boards the user can access.
 * @param prepend HTML to add at the top of the dialog.
 * @param remember If present, a checkbox asking to remember the user's selection will appear at the bottom of the
 *  dialog, by the button(s). If this value evaluates to true, the checkbox will be initially checked.
 *  If false, it will be unchecked. The checked status will then be passed along to the callback function.
 */
data class BoardSelectOptions(
    val id: Number? = undefined,
    val multiSelect: Boolean = false,
    val useExisting: Boolean = false,
    val accessible: Boolean = false,
    val prepend: String? = undefined,
    val remember: Boolean? = undefined
)