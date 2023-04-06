package lesson_7

fun main() {

    println("Укажите размер пароля, который необходимо сгенирировать: ")
    val quantitySymbols = readln().toInt()
    val rangeSymbols = ('a'..'z') + ('A'..'Z') + ('0'..'9')

    var password = ""
    for (i in quantitySymbols downTo 1) {
        password = password.plus(rangeSymbols.random())
    }
    println(password)
}