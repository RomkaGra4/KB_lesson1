package lesson_1_10.lesson_9

import java.util.*

fun main() {

    val userIngredientList = mutableListOf<String>()

    println("Запишите названия ингредиентов: ")
    for (i in 0 until 5) {
        println("Укажите ингредиент №${i + 1}:")
        val ingredient = readln()
        userIngredientList.add(ingredient)
    }

    userIngredientList.sort()

    println("${
        userIngredientList.toSet().joinToString().replaceFirstChar
        { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
    }."
    )
}