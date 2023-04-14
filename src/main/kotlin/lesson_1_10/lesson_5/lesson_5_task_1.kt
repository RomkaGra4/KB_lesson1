package lesson_1_10.lesson_5

fun main() {

    val numberOne = 9
    val numberTwo = 6
    val sum = numberOne + numberTwo
    println("Для входа в программу, укажите сумму двух чисел: $numberOne и $numberTwo.")
    val result = readln().toInt()

    if (result == sum)
        println("Добро пожаловать!")
    else
        println("Доступ запрещен.")
}