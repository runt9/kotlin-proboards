package data

data class UserData(
    val avatar: String,
    val birthday: Birthday?,
    val block_list: BlockList,
    val custom_field_names: List<String>,
    val custom_fields: List<Any>,
    val date_format: String,
    val default_post_mode: String,
    val friends: dynamic, // TODO: Figure out friends format
    val global_id: Long,
    val group_ids: List<Int>,
    val has_new_messages: Int,
    val id: Long,
    val instant_messengers: InstantMessengers,
    val is_invisible: Int,
    val is_logged_in: Int,
    val is_staff: Int,
    val last_online: TimestampHolder,
    val name: String,
    val posts: Long,
    val proboards_plus: Int,
    val rank: Rank,
    val registered_on: TimestampHolder,
    val status: String,
    val theme_id: Int,
    val time_format: String,
    val url: String,
    val username: String
) {
    data class Birthday(val day: Int, val month: Int, val year: Int)
    data class BlockList(val user_ids: List<Long>)
    data class InstantMessengers(val aim: String, val yim: String, val skype: String, val msn: String, val icq: String)
    data class TimestampHolder(val unix_timestamp: Long)
    data class Rank(val name: String, val id: Long)
}