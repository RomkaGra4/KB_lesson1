package lesson_5

fun main() {

    val login = "Batman"
    val password = "password"

    print("Введите логин:")
    val userLogin = readLine()!!.toString()
    if (login == userLogin) {
        print("Введите пароль:")
        val userPassword = readLine()!!.toString()
        if (password == userPassword)
            println("Добро пожаловать!")
    } else
        println("Пользователь не найден! Просьба пройти регистрацию.")

}