package lesson_9

import java.util.*

fun main() {

    val userIngredientList = mutableListOf<String>()

    println("Запишите названия ингредиентов: ")
    for (i in 0 until 3) {
        println("Укажите ингредиент №${i + 1}:")
        val ingredient = readln()
        userIngredientList.add(ingredient)
    }

    userIngredientList.sort()
    val userIngredientSet = mutableSetOf<String>()
    for (i in userIngredientList)
        userIngredientSet.add(i)

    println("${
        userIngredientSet.joinToString().replaceFirstChar
        { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
    }."
    )

}