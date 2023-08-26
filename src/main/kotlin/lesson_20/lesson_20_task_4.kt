package lesson_20

fun main() {

    val listOfElements = mutableListOf("ПЕРВЫЙ", "ВТОРОЙ", "ТРЕТИЙ")

    val listOfElementsWithLambda = listOfElements.map {
        println("Нажат элемент $it")
    }
}