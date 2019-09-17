import org.w3c.dom.Node

@Suppress("unused", "FunctionName")
external class ListManager {
    fun get_selection(): SelectedItems
    fun select_item(item: String)
    fun select_items(items: List<String>)
    fun unselect_item(item: String)
    fun unselect_items(items: List<String>)
}

data class SelectedItems(val ids: List<NumberUtility>, val length: NumberUtility, val items: List<Node>)