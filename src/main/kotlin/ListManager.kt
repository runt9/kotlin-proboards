import org.w3c.dom.Node

/**
 * Currently this class is primarily useful for dealing with the selection and deselection of threads.
 */
@Suppress("unused", "FunctionName")
external class ListManager {
    /**
     * Returns the currently selected items.
     *
     * @return SelectedItems object
     */
    fun get_selection(): SelectedItems

    /**
     * Marks the given item as selected.
     *
     * @param item A jQuery selector representing the item to select.
     */
    fun select_item(item: String)

    /**
     * Marks the given items as selected. Each item in the array that's passed in will have select_item called on it individually.
     *
     * @param items An array of jQuery selectors for the items to select.
     */
    fun select_items(items: List<String>)

    /**
     * Marks the given item as unselected.
     *
     * @param item A jQuery selector for the item to unselect.
     */
    fun unselect_item(item: String)

    /**
     * Marks the given items as unselected. Each item in the array that's passed in will have unselect_item called on it individually.
     *
     * @param items An array of jQuery selectors for the items to unselect.
     */
    fun unselect_items(items: List<String>)
}

/**
 * @param ids An array of the IDs of all selected items
 * @param length The number of selected items
 * @param items An Array of the DOM elements of all selected items
 */
data class SelectedItems(val ids: List<NumberUtility>, val length: NumberUtility, val items: List<Node>)