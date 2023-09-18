package lesson_11

fun main() {

    val forum = Forum()
    forum.createNewUser(UserForum("КЛИЕНТ"))
    forum.createNewUser(UserForum("СПРАВОЧНАЯ"))

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
    var authorId = 0
    fun createNewUser(userName: UserForum, authorId: Int = ++this.authorId) {
        users.add(UserForum(userName.name, authorId))
        println("Добавлен новый пользователь ${userName.name} c ID - ${authorId}.")
    }

    fun createNewMessage(authorId: Int, message: String) {
        val authorAndMessage: MessageForum = MessageForum(users[authorId - 1], message)
        messages.add(authorAndMessage)
    }

    fun printThread() {

        messages.forEach {
            println("${it.user.name} (ID №${it.user.authorId}): ${it.text}")
        }
    }
}

class UserForum(val name: String, var authorId: Int = 0)
class MessageForum(val user: UserForum, val text: String)