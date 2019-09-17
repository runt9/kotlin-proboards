/**
 * Contains utility functions for dealing with members.
 */
@Suppress("unused", "FunctionName")
external object MemberUtility {
    /**
     * Loads a user search box in a dialog and calls a return function on finish.
     * Note: Only admins will be able to access this function.
     *
     * @param options
     * @see MemberSelectOptions
     * @param callback Function to call when members have been selected. The first argument is an array of member IDs.
     */
    fun select(options: MemberSelectOptions? = definedExternally, callback: Function<List<NumberUtility>>)
}

/**
 * @param title The title of this dialog box. Defaults To: User Selection
 * @param selected An array of user IDs to start selected.
 * @param max The maximum number of allowed selections; a value of 0 means no maximum.
 */
data class MemberSelectOptions(val title: String? = undefined, val selected: List<NumberUtility>? = undefined, val max: NumberUtility? = undefined)