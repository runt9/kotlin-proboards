package data.page

data class PageData(
    val board: BoardPage? = undefined,
    val category: CategoryPage? = undefined,
    val conversation: ConversationPage? = undefined,
    val member: MemberPage? = undefined,
    val post: PostPage? = undefined,
    val thread: ThreadPage? = undefined
)