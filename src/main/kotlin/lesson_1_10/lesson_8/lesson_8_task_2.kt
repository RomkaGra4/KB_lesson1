package lesson_1_10.lesson_8

fun main() {

    val breadIngredient = arrayOf("мука", "соль", "сахар", "вода", "дрожжи", "масло")
    println("Какой ингридиент Вас интересует?")
    val userIngredient = readln()

    for (i in breadIngredient) {

        if (userIngredient == i) {
            println("Ингредиент $userIngredient в рецепте есть")
            return
        }
    }
    println("Такого ингредиента в рецепте нет")
}