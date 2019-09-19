/**
 * Contains functions for binding events. The following is a list of ProBoards events that can be used and when they are triggered:
 *  - afterSearch - After an autosearch is completed in a board, thread, or conversation
 *  - columnSort - A column is sorted
 *  - moreActivity - When the 'More Activities' button is clicked in a user's profile
 *  - moreNotification - When the 'More Notifications' button is clicked in a user's profile
 *  - pageChange - When pagination occurs in a thread or conversation
 */
@Suppress("unused", "FunctionName")
external object EventUtility {
    /**
     * Creates a bind for the specified event.
     *
     * @param event The name of the event on which to bind.
     * @param callback The function to run when the specified event occurs.
     */
    fun <T> on(event: String, callback: Function<T>)

    /**
     * Creates a bind for the specified event that will only be triggered once.
     *
     * @param event The name of the event on which to bind.
     * @param callback The function to run when the specified event occurs.
     */
    fun <T> one(event: String, callback: Function<T>)
}