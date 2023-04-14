package lesson_1_10.lesson_10

fun main() {

    println("Регистрация:")
    val login = getLogin()
    val password = getPassword()
    println("*************")
    println("Авторизация.")
    performAuthorization(login, password)

}

fun performAuthorization(login: String, password: String) {

    do {
        println("Введите логин:")
        val loginInput = readln()
        println("Введите пароль:")
        val passwordInput = readln()
        if (loginInput != login || passwordInput != password)
            println("Ошибка! Неверный логин и/или пароль! Повторите процедуру ввода логина и пароля!")
    } while (loginInput != login || passwordInput != password)

    do {
        val randomCode = (1000..9999).random()
        println("Ваш код авторизации: $randomCode")

        println("Введите КОД для авторизации: ")
            if (randomCode != readln().toInt()){
            println("Код неверен! Повторите попытку ввода КОДа!")
            }
    } while (randomCode != readln().toInt())

    println("Авторизация выполнена! Добро пожаловать ;)")
}

fun getPassword(): String {
    val symbolRange = ('a'..'z') + ('0'..'9')
    var password = ""
    for (i in 1..6) {
        password += symbolRange.random()
    }
    println("Ваш пароль: $password")
    return password
}

fun getLogin(): String {
    println("Укажите Ваш логин:")
    var userLogin = readln()
    while (userLogin.length < 4) {
        userLogin = readln()
    }
    println("Ваш логин: $userLogin")
    return userLogin
}