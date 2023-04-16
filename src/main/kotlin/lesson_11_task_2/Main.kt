package lesson_11_task_2

fun main() {
    val user = UserData(
        id = 1,
        login = "Роман",
        password = "roro515",
        email = "roman945@mail.ru"
    )

    user.printUserInformation()
    user.getInformationAndSaveInBio()
    user.changePassword()
    user.getTextForSend()
}

class UserData(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    val bio: String = "",
) {

    fun printUserInformation() {
        println(
            """"Данные пользователя:
    ID - $id
    Логин - $login
    Пароль - $password
    Email - $email
    """.trimIndent()
        )
    }

    fun getInformationAndSaveInBio() {
        println("Введите информацию о себе:")
        val bio = readln()
    }

    fun changePassword() {
        println("Введите текущий пароль:")
        if (password == readln()) {
            println("Введите новый пароль:")
            password = readln()
            println("Пароль изменен!")
        }
    }

    fun getTextForSend() {
        println("Введите текст, который мы отправим пользователю:")
        println("Дорогой $login, ${readln()}")
        println("*****ПИСЬМО ОТПРАВЛЕНО!*****")
    }

}