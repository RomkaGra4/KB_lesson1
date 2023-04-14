package lesson_1_10.lesson_8

fun main() {

    println("Введите планируемое количество ингредиентов: ")
    val quantityOfIngredients = readln().toInt()
    var arrayOfIngredients = Array<String?>(quantityOfIngredients) { null }

    for (i in 0 until quantityOfIngredients) {
        println("Введите ${i + 1} ингредиент:")
        arrayOfIngredients.set(i, readln())
    }

    for (i in arrayOfIngredients)
        println(i)
}

