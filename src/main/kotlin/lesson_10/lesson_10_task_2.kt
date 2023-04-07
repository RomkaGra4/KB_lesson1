package lesson_10

fun main() {

    println("Введите логин:")
    val login = readln()
    checkLength(login)
    println("Введите пароль:")
    val password = readln()
    checkLength(password)
}

fun checkLength(symbols: String) {
    if (symbols.length < 4)
        println("Логин или пароль недостаточно длинные")
}

