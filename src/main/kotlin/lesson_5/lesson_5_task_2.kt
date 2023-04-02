package lesson_5

const val AGE_OF_MAJORITY = 18

fun main() {

    println("Введите год Вашего рождения:")
    val age = readln().toInt()

    if ((2023 - age) >= AGE_OF_MAJORITY)
        println("Показать экран со скрытым контентом")

}