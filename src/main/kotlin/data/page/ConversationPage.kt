package data.page

data class ConversationPage(
    val created_by: Long,
    val created_on: Long,
    val id: Long,
    val is_archived: Int,
    val is_new: Int,
    val url: String
) : Page