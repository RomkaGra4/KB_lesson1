package lesson_11

fun main() {

    val forum = Forum()
    forum.createNewUser(UserForum("КЛИЕНТ", 1))
    forum.createNewUser(UserForum("СПРАВОЧНАЯ", 2))

    forum.createNewMessage(1, MessageForum("Здравствуйте! Это аэропорт?"))
    forum.createNewMessage(2, MessageForum("Добрый день! Верно."))
    forum.createNewMessage(1, MessageForum("Хочу узнать - рейс 'Москва - Актау' вылетает по расписанию?"))
    forum.createNewMessage(2, MessageForum("Сейчас проверим. Секунду... Да, без изменений!"))

    forum.printThread()

}

class Forum {
    val users = mutableListOf<UserForum>()
    val messages = mutableListOf<MessageForum>()

    fun createNewUser(userName: UserForum) {
        users.add(userName)
        println("Добавлен новый пользователь $userName.")
    }

    fun createNewMessage(authorId: Int, message: MessageForum) {
        messages.add(message)
    }

    fun printThread() {

        for (i in 0 until messages.size)
            if (i % 2 == 0)
                println("${users[0]}: ${messages[i]}")
            else
                println("${users[1]}: ${messages[i]}")
    }
}

class UserForum(name: String, authorId: Int)
class MessageForum(text: String)