package lesson_11

fun main() {

    val forum = Forum()
    forum.createNewUser("КЛИЕНТ")
    forum.createNewUser("СПРАВОЧНАЯ")
    forum.createNewMessage("Здравствуйте, это аэропорт?")
    forum.createNewMessage("Добрый день! Верно.")
    forum.createNewMessage("Хочу узнать - рейс 'Москва - Актау' вылетает по расписанию?")
    forum.createNewMessage("Сейчас проверим. Секунду... Да, без изменений!")
    println()
    forum.printThread()

}

class Forum {
    val users = mutableListOf<String>()
    val messages = mutableListOf<String>()

    fun createNewUser(userName: String) {
        users.add(userName)
        println("Добавлен новый пользователь $userName")
    }

    fun createNewMessage(message: String) {
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