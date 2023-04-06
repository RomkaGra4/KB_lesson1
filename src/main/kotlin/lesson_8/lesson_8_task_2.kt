package lesson_8

fun main() {

    val breadIngredient = arrayOf("мука", "соль", "сахар", "вода", "дрожжи", "масло")
    println("Какой ингридиент Вас интересует?")
    val userIngredient = readln()

    for (i in breadIngredient) {
        if (userIngredient in breadIngredient) {
            println("Ингредиент $userIngredient в рецепте есть")
            break
        }
        println("Такого ингредиента в рецепте нет")
        break
    }
}