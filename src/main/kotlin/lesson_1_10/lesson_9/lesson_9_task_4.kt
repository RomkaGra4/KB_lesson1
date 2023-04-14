package lesson_1_10.lesson_9

fun main(){

    println("Введи 5 названий ингредиентов блюда:")
    val userIngedients = readln()
    val listIngredients = userIngedients.split(", ")
    val sortList = listIngredients.sorted()

    sortList.forEach{
        println(it)
    }
}