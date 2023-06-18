package lesson_15

fun main() {

    val user1 = RegularUser("Пользователь Андрей")
    val admin1 = Admin("Администратор Ольга")

    admin1.sendMessage()
    user1.readMessage()
    user1.sendMessage()
    admin1.readMessage()
    admin1.deleteMessage()
    admin1.deleteUser()

}

abstract class User {

    abstract val userName: String
    abstract fun readMessage()
    abstract fun sendMessage()

}

class RegularUser(override val userName: String) : User() {
    override fun readMessage() {
        println("$userName читает сообщение")
    }

    override fun sendMessage() {
        println("$userName отправляет сообщение")
    }
}

class Admin(override val userName: String) : User(), AdminActions {
    override fun readMessage() {
        println("$userName читает сообщение")
    }

    override fun sendMessage() {
        println("$userName отправляет сообщение")
    }

    override fun deleteMessage() {
        println("$userName удаляет сообщение")
    }

    override fun deleteUser() {
        println("$userName удаляет пользователя")
    }
}

interface AdminActions {

    fun deleteMessage()
    fun deleteUser()

}