import js.externals.jquery.JQuery
import org.w3c.dom.Node

/**
 * Contains utility functions for opening dialogs.
 */
@Suppress("unused", "FunctionName")
external object WindowUtility {
    /**
     * Builds a ProBoards alert dialog box with a single 'Ok' button. If options is supplied, title must be supplied as well.
     *
     * @param title The title of this dialog box. Defaults To: Alert
     * @param text The text for this dialog.
     * @param options Takes an options object that accepts any options to pb.window.dialog.
     *
     * TODO: Make options a jQuery UI Dialog options object
     */
    fun alert(title: String? = definedExternally, text: String, options: Map<String, Any>)

    /**
     * Builds a ProBoards confirmation dialog box with the option to choose 'Yes' or 'No'.
     *
     * @param question The text for this dialog.
     * @param onYes Function to run if they choose 'Yes'.
     * @param options Additional options
     * @return The created confirm element.
     */
    fun <T> confirm(question: String, onYes: Function<T>, options: ConfirmOptions): JQuery<Node>

    /**
     * Builds a ProBoards dialog box. Specifying an existing ID will allow you to re-use an existing dialog.
     * For more information on the options that can be passed in to the options Object,
     * please see the API documentation for jQueryUI's dialog widget.
     *
     * @param ID The ID of this dialog.
     * @param options This accepts any options that are allowed by jQuery UI's dialog widget.
     * @return The created dialog element.
     *
     * TODO: Make options a jQuery UI Dialog options object
     */
    fun dialog(ID: String, options: Map<String, Any>)

    /**
     * Displays a simple ProBoards error dialog box.
     *
     * @param HTML The HTML to put in the dialog box.
     */
    fun error(HTML: String)

    /**
     * Displays a large preview dialog for full size images.
     *
     * @param URL The URL of the image for which to display a preview.
     */
    fun image_preview(URL: String)

    /**
     * Builds a dialog with one or more selectable items and calls a return function on finish.
     *
     * @param options Additional Options
     */
    fun select_dialog(options: SelectDialogOptions)
}

/**
 * @param title The title of the dialog box. Defaults To: Confirm
 * @param overlay True will apply an overlay over the page when the confirmation dialog is open. Defaults To: false
 * @param onNo Function to run if they choose 'No'.
 * @param onClose Function to run if they close the dialog without making a selection.
 */
data class ConfirmOptions(
    val title: String? = undefined,
    val overlay: Boolean? = undefined,
    val onNo: Function<*>? = undefined,
    val onClose: Function<*>? = undefined
)

/**
 * @param title The title of this selection dialog. Defaults To: Selection
 * @param selected IDs of options that will start selected.
 * @param max The maximum number of selectable choices. A value of 0 means there is no limit. A value of 1 will make the list a click-to-select list.
 * @param options Array of Objects where each object contains a label and value
 * @param onComplete Function called when selections have been made. The first argument is an array of selected IDs/values.
 */
data class SelectDialogOptions(
    val title: String? = "Selection",
    val selected: List<Number>? = undefined,
    val max: Number? = undefined,
    val options: List<Label>? = undefined,
    val onComplete: Function<List<String>>? = undefined
) {
    /**
     * @param label Option label.
     * @param value Option ID/value.
     */
    data class Label(val label: String, val value: String)
}