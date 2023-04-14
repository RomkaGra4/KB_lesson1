package lesson_1_10.lesson_5

fun main() {

    val firstNumber = 45
    val secondNumber = 73

    println("Введите два числа (от 1 до 100):")
    val firstUserNumber = readln().toInt()
    val secondUserNumber = readln().toInt()

    val result =
        if (firstUserNumber == firstNumber && secondUserNumber == secondNumber) "Поздравляем! Вы выиграли главный приз!"
        else if (firstUserNumber == firstNumber || secondUserNumber == secondNumber) "Вы выиграли утешительный приз!"
        else "Неудача! Крутите барабан!"

    println(result)
    println("Числа, необходимые для победы: $firstNumber и $secondNumber")
}