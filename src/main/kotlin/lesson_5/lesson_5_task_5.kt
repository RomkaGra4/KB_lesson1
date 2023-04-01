package lesson_5

fun main(){

    println("Введите два числа (от 1 до 100):")
    val firstUserNumber = readLine()!!.toInt()
    val secondUserNumber = readLine()!!.toInt()

    val firstNumber = (Math.random() * 100).toInt()
    val secondNumber = (Math.random() * 100).toInt()

    val result = if (firstUserNumber == firstNumber && secondUserNumber == secondNumber) "Поздравляем! Вы выиграли главный приз!"
    else if (firstUserNumber == firstNumber || secondUserNumber == secondNumber) "Вы выиграли утешительный приз!"
    else "Неудача! Крутите барабан!"

    println(result)
    println("Числа, необходимые для победы: $firstNumber и $secondNumber")
}