package lesson_11_task_2

class UserData(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    val bio: String = "",
) {

    fun printUserInformation() {
        println(""""Данные пользователья:
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