package lesson_11

fun main() {

    val forum = Forum()
    forum.createNewUser(UserForum("КЛИЕНТ", 1))
    forum.createNewUser(UserForum("СПРАВОЧНАЯ", 2))

    println()

    forum.createNewMessage(1, "Здравствуйте! Это аэропорт?")
    forum.createNewMessage(2, "Добрый день! Верно.")
    forum.createNewMessage(1, "Хочу узнать - рейс 'Москва - Актау' вылетает по расписанию?")
    forum.createNewMessage(2, "Сейчас проверим. Секунду... Да, без изменений!")

    forum.printThread()

}

class Forum {
    val users = mutableListOf<UserForum>()
    val messages = mutableListOf<MessageForum>()

    fun createNewUser(userName: UserForum) {
        users.add(userName)
        println("Добавлен новый пользователь ${userName.name}.")
    }

    fun createNewMessage(authorId: Int, message: String) {
        val authorInMessage: MessageForum? = when (authorId) {
            1 -> MessageForum(users[authorId - 1], message)
            2 -> MessageForum(users[authorId - 1], message)
            else -> {
                null
            }
        }
        if (authorInMessage != null) {
            messages.add(authorInMessage)
        }
    }

    fun printThread() {

        messages.forEach {
            println("${it.user.name}: ${it.text}")
        }
    }
}

class UserForum(val name: String, val authorId: Int)
class MessageForum(val user: UserForum, val text: String)