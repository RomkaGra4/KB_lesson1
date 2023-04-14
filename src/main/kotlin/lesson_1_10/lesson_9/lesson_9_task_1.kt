package lesson_1_10.lesson_9

fun main(){

    val listOfIngredient = listOf("мука", "вода", "соль", "перец", "масло")

    println("В рецепте есть следующие ингредиенты: $listOfIngredient")
    listOfIngredient.forEach{ println(it)}
}
