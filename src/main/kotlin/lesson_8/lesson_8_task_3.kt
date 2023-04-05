package lesson_8

fun main() {

    val breadIngredient = arrayOf("мука", "соль", "сахар", "вода", "дрожжи", "масло")
    println("Какой ингридиент Вас интересует?")
    val userIngredient = readln()

    if (userIngredient in breadIngredient) {
        println("Ингредиент $userIngredient в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}