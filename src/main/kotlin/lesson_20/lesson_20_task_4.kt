package lesson_20

fun main() {

    val listOfElements = mutableListOf("ПЕРВЫЙ", "ВТОРОЙ", "ТРЕТИЙ")

    val listOfElementsWithLambda: List<() -> Unit> = listOfElements.map {
        {
            println(it)
        }
    }

    listOfElementsWithLambda.map {
        if ((listOfElementsWithLambda.indexOf(it) + 1) % 2 == 0)
            println("Нажат элемент $it")
    }
}