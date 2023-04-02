package lesson_5

fun main(){

    val sum = 9 + 6
    println("Для входа в программу, укажите сумму двух чисел: 9 и 6.")
    val result = readln().toInt()

    if (result == sum)
        println("Добро пожаловать!")
    else
        println("Доступ запрещен.")
}