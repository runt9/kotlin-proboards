import js.externals.jquery.JQuery
import org.w3c.dom.Node

// TODO: Update all JavaDocs to match API docs from ProBoards
@Suppress("unused", "FunctionName")
external object ProBoards {
    val board: BoardUtility = definedExternally
    val date: DateUtility = definedExternally
    val events: EventUtility = definedExternally
    val form: FormUtility = definedExternally
    val image: ImageUtility = definedExternally
    val member: MemberUtility = definedExternally
    val number: NumberUtility = definedExternally
    val text: TextUtility = definedExternally
    val thread: ThreadUtility = definedExternally

    /**
     * @return Int The number of outstanding AJAX calls.
     */
    fun active_ajax_calls(): Int

    /**
     * Provides access to a given cookie to allow setting or getting it.
     * @param key The cookie name
     * @return Nullable Cookie object
     */
    fun <T> cookie(key: String): Cookie<T>?

    /**
     * @return Gets an arbitrary piece of data stored in the ProBoards Data API
     */
    fun <T> data(key: String): T?

    /**
     * Sets the given data field in ProBoards.
     *
     * @param key The key to set
     * @param value The value to set
     */
    fun <T> data(key: String, value: T)

    /**
     * Allows bulk creation of data keys. If a key is given with a null value,
     * that key and associated data will be deleted
     *
     * @param List of Data entries
     */
    fun <T> data(values: List<Data<T>>)

    /**
     * @return JQuery element for the ProBoards help icon
     */
    fun help_icon(): JQuery<Node>

    /**
     * @return A handle to the ProBoards item object with the given ID
     */
    fun <T> item(type: String, ID: String, key: String? = definedExternally, value: String? = definedExternally): T?

    /**
     * @return A handle to the listManager with this ID.
     * Currently this class is primarily useful for dealing with the selection and deselection of threads.
     */
    fun list_manager(listmanager_id: NumberUtility)

    /**
     * Creates a loading overlay or dialog on a specific element.
     *
     * @param element A jQuery selector string defining the element(s) you want to have covered by the overlay.
     * If nothing is supplied, a loading dialog will be generated as well.
     * @param flag If true, turns the overlay or dialog on. If false, turns the overlay or dialog off.
     */
    fun loading(element: String? = definedExternally, flag: Boolean)

    /**
     * Calculates the number of elements in an object. This utility function is preferred over manually looping,
     * since it automatically handles the exclusion of properties, which can lead to unexpected results in certain browsers.
     *
     * @param `object` The object whose size you are interested in.
     * @return The size of the object.
     */
    fun size(`object`: dynamic): Number

    /**
     * Returns a flag for determining whether or not there are unsaved changes on this page.
     *
     * @return True means there are unsaved changes, false means there are no unsaved changes.
     */
    fun unsaved_changes(): Boolean
}