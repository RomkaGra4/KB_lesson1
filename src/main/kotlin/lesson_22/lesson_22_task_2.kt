package lesson_22

fun main() {

    val book1 = OrdinaryBook("Книга", "Автор")
    val book2 = UnusualBook("Книга", "Автор")

    println(book1) // Выводит ссылку на объект
    println(book2) // Выводит конкретные параметры объекта благодаря переопределению функции toString()

}

class OrdinaryBook(
    val name: String,
    val author: String,
)

data class UnusualBook(
    val name: String,
    val author: String,
)