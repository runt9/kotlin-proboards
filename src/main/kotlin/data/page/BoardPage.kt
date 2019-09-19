package data.page

data class BoardPage(
    val description: String,
    val disable_post_counts: Int,
    val disable_posting: Int,
    val display_name: String,
    val hidden: Int,
    val id: Long,
    val name: String,
    val name_unescaped: String,
    val posts: Long,
    val show_announcements: Int,
    val threads: Int,
    val url: String
) : Page