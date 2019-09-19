package data.page

data class PostPage(
    val created_by: Long,
    val created_on: Long,
    val id: Long,
    val ip: String,
    val liked: Int,
    val thread_id: Long,
    val url: String
) : Page