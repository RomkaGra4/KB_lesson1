package lesson_10

fun main() {

    println("Введите логин:")
    if (!validate(readln())) {
        println("Кол-во символов в логине недостаточно")
    }

    println("Введите пароль:")
    if (!validate(readln())) {
        println("Кол-во символов в пароле недостаточно")
    }
}

fun validate(symbols: String): Boolean {
    return symbols.length >= 4
}
