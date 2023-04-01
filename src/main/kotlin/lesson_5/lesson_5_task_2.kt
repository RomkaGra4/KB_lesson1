package lesson_5

const val AGE_OF_MAJORITY = 18

fun main(){

    println("Введите год Вашего рождения:")
    val age = readLine()!!.toInt()

    if ((2023 - age) >= 18)
        println("Показать экран со скрытым контентом")

}