package lesson_6

fun main(){

    print("Для регистрации введите логин: ")
    val userName = readLine()!!.toString()
    print("Введите пароль: ")
    val userPassword = readLine()!!.toString()

    print("Введите Ваш логин:")

    do {
        val login = readLine()!!.toString()
    } while (login == userName)

    println("Введите пароль:")
    do {
        val password = readLine()!!.toString()
            if (userPassword != password)
            println("Пароль некорректный! Повторите попоытку!")
    } while (userPassword != password)

    println("Авторизация прошла успешно")
}