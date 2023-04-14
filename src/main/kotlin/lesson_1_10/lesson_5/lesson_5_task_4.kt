package lesson_1_10.lesson_5

fun main() {

    val login = "Batman"
    val password = "password"

    print("Введите логин:")
    if (login == readln()) {
        print("Введите пароль:")

        if (password == readln())
            println("Добро пожаловать!")
    } else
        println("Пользователь не найден! Просьба пройти регистрацию.")

}