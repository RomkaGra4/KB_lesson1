package lesson_22

fun main() {

    val firstBook = RegularBook("Война и мир", "Л.Н. Толстой")
    val secondBook = RegularBook("Война и мир", "Л.Н. Толстой")
    val thirdBook = DataBook("Война и мир", "Л.Н. Толстой")
    val fourthBook = DataBook("Война и мир", "Л.Н. Толстой")

    println(firstBook == secondBook) // Вывод false т.к. сравниваются ссылки на объекты в памяти, а не значения
    println(secondBook.equals(thirdBook)) // Вывод false т.к. сравниваются объекты с разными типами классов
    println(thirdBook == fourthBook) // Вывод true т.к. сравниваются именно значения объектов

}

class RegularBook(
    val name: String,
    val author: String,
)

data class DataBook(
    val name: String,
    val author: String,
)