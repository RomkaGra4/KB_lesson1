package lesson_8

fun main() {

    println("Введите планируемое количество ингредиентов: ")
    val quantityOfIngredients = readln().toInt()
    var arrayOfIngredients = Array<String?>(quantityOfIngredients) { null }

    for (i in 0 until quantityOfIngredients) {
        println("Введите ингредиент с индексом $i")
        arrayOfIngredients.set(i, readln())
    }
}

