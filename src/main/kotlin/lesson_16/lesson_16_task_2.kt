package lesson_16
import kotlin.math.pow

private const val PI = 3.14

fun main() {
    val result = Circle(5)
    result.printCircumference()
    result.printAreaOfACircle()
}

class Circle(private val radius: Int) {

    fun printCircumference() {
        val circumference = PI * (radius * 2)
        println(circumference.toFloat())
    }

    fun printAreaOfACircle() {
        val square = PI * (radius.toDouble().pow(2.0))
        println(square.toFloat())
    }
}