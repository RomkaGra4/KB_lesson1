package lesson_16

fun main() {
    val result = Cube()
    result.printResult()
}

class Cube {

    private val number = listOf(1, 2, 3, 4, 5, 6)

    fun printResult() {
        println(number.random())
    }

}