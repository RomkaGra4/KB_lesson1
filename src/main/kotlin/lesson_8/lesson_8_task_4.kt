package lesson_8

fun main() {

    val breadIngredient = arrayOf("мука", "соль", "сахар", "вода", "дрожжи", "масло")

    println("Какой ингредиент Вы хотите заменить?")
    val userIngredient = readln()
    val index = breadIngredient.indexOf(userIngredient)

    if (userIngredient in breadIngredient) {
        println("На какой ингридиент Вы хотели бы заменить его в рецепте?")
        val newUserIngredient = readln()
        breadIngredient[index] = newUserIngredient
        println("Готово! Вы сохранили следующий список: ")
        for (i in breadIngredient) {
            print("$i ")
        }
    } else {
        println("Данного ингридиента нет в рецепте")
    }

}