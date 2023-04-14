package lesson_1_10.lesson_9

fun main() {

    val ingredientsForOnePerson = mutableListOf(2, 50, 15)

    println("Укажите количество порций:")
    val portion = readln().toInt()

    val totalServings = ingredientsForOnePerson.map {
        it * portion
    }

    println("На $portion порций вам понадобится: Яиц – ${totalServings[0]}, молока – ${totalServings[1]}, сливочного масла – ${totalServings[2]}")
}