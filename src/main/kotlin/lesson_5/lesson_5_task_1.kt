package lesson_5

fun main(){

    println("Для входа в программу, укажите сумму двух чисел: 9 и 6.")
    val result = readLine()!!.toInt()

    if (result == 15)
        println("Добро пожаловать!")
    else
        println("Доступ запрещен.")
}