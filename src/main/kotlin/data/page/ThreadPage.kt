package data.page

data class ThreadPage(
    val board_id: Long,
    val created_by: Long,
    val created_on: Long,
    val first_post_id: Long,
    val id: Long,
    val is_announcement: Int,
    val is_bookmarked: Int,
    val is_falling: Int,
    val is_locked: Int,
    val is_muted: Int,
    val is_new: Int,
    val is_poll: Int,
    val is_sticky: Int,
    val last_post_id: Long,
    val last_post_time: Long,
    val posts: Long,
    val subject: String,
    val subject_unescaped: String,
    val url: String,
    val views: Long
)