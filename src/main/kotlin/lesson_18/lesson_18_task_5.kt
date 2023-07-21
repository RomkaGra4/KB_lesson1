package lesson_18

fun main() {
    val circle1 = Circle(1, 3)
    val square1 = Square(3,5)
    val dot1 = Dot(2,9)

    println(circle1.draw())
    println(square1.draw())
    println(dot1.draw())

}

abstract class Screen(private val x: Int, private val y: Int) {

    open fun draw() = ""

}

class Circle(
    private val x: Int,
    private val y: Int,
    private val anObject: String = "Круг",
) : Screen(x, y) {
    override fun draw() = "Создан объект $anObject с координатами: x = $x, y = $y"
}

class Square(
    private val x: Int,
    private val y: Int,
    private val anObject: String = "Квадрат",
) : Screen(x, y) {
    override fun draw() = "Создан объект $anObject с координатами: x = $x, y = $y"
}

class Dot(
    private val x: Int,
    private val y: Int,
    private val anObject: String = "Точка",
) : Screen(x, y) {
    override fun draw() = "Создан объект $anObject с координатами: x = $x, y = $y"
}