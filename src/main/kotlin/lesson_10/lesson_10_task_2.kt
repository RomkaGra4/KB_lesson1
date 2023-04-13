package lesson_10

fun main() {

    println("Введите логин:")
    val login = readln()
    validateAndPrint(login)
    println("Введите пароль:")
    val password = readln()
    validateAndPrint(password)
}

fun validateAndPrint(symbols: String) {
    if (symbols.length < 4)
        println("Логин или пароль недостаточно длинные")
}
