package lesson_16

import kotlin.math.pow

private const val PI = 3.14
fun main() {
    val result = Circle(5.0)
    result.printCircumference()
    result.printAreaOfACircle()
}

class Circle(private val radius: Double) {
    fun printCircumference() {
        val circumference = PI * (radius * 2)
        println(circumference)
    }

    fun printAreaOfACircle() {
        val square = PI * (radius.pow(2))
        println(square)
    }
}
