package lesson_10

fun main() {

    println("Введите логин:")
    val login = readln()
    if (!validate(login)) {
        println("Кол-во символов в логине недостаточно")
    }

    println("Введите пароль:")
    val password = readln()
    if (!validate(password)) {
        println("Кол-во символов в логине недостаточно")
    }
}

fun validate(symbols: String): Boolean {
    var result: Boolean = true
    if (symbols.length < 4) {
        result = false
    }
    return result
}
