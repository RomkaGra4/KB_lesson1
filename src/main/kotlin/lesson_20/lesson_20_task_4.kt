package lesson_20

fun main() {

    val listOfElements = mutableListOf("ПЕРВЫЙ", "ВТОРОЙ", "ТРЕТИЙ")

    val listOfElementsWithLambda: (List<String>) -> List<Unit> = {
        listOfElements.map {
            if ((listOfElements.indexOf(it) + 1) % 2 == 0)
                println("Нажат элемент $it")
        }
    }
    listOfElementsWithLambda.invoke(listOfElements)
}