/**
 * Contains utility functions for dealing with threads.
 */
external object ThreadUtility {
    /**
     * Loads a thread selection list in a dialog and calls a return function on finish.
     * Note: Only admins will be able to access this function.
     *
     * @param board_id The ID of the board from which to generate the dialog.
     * @param callback Function to call when a thread has been selected. The first argument is the thread ID.
     * @param options Additional options
     */
    fun <T> select(board_id: Number, callback: Function<T>, options: ThreadSelectOptions? = definedExternally)
}

/**
 * @param remember If present, a checkbox asking to remember the user's selection will appear at the
 *  bottom of the dialog, by the button(s). If this value evaluates to true, the checkbox will be initially checked.
 *  If false, it will be unchecked. The checked status will then be passed along to the callback function.
 */
data class ThreadSelectOptions(val remember: Boolean? = undefined)