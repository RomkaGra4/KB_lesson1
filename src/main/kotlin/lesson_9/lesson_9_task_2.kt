package lesson_9

fun main() {

    val listOfIngredients = mutableListOf("вода", "соль", "мука")
    println("В рецепте есть базовые ингредиенты:")
    listOfIngredients.forEach { println(it) }

    println("Желаете добавить еще?")
    if (readln() == "да") {
        println("Какой ингредиент вы хотите добавить?")
        listOfIngredients.add(readln())
        println("Теперь в рецепте есть следующие ингредиенты: $listOfIngredients")
    }
}