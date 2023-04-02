package lesson_6

fun main(){

    print("Для регистрации введите логин: ")
    val userName = readln()
    print("Введите пароль: ")
    val userPassword = readln()
    print("Введите Ваш логин:")

    do {
        val login = readln()
    } while (login != userName)

    println("Введите пароль:")
    do {
        val password = readln()
            if (userPassword != password)
            println("Пароль некорректный! Повторите попоытку!")
    } while (userPassword != password)

    println("Авторизация прошла успешно")
}