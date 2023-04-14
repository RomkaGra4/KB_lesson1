package lesson_1_10.lesson_6

fun main() {

    val randomNumber = (1..9).random()
    var attempt = 5

    println("Введите одно число от 1 до 9: ")
    do {
        val userNumber = readln().toInt()
        if (userNumber == randomNumber)
            println("Это была великолепная игра!")
        attempt--
    } while (randomNumber != userNumber && attempt != 0)
}