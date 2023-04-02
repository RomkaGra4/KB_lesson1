package lesson_6

fun main() {

    println("Докажи, что ты не бот!")
    var counter = 3

    do {
        val numberOne = (0..9).random()
        val numberTwo = (0..9).random()
        val sum = numberOne + numberTwo

        println("Введи сумму чисел: $numberOne и $numberTwo")
        val userAnswer = readln().toInt()

        if (sum == userAnswer) {
            println("Добро пожаловать!")
            continue
        }

        counter--

        if (counter == 0)
            println("Доступ запрещен!")

    } while (sum != userAnswer && counter != 0)
}