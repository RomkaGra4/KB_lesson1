package lesson_18

fun main() {
    val circle1 = Circle()
    val square1 = Square()
    val dot1 = Dot()

    println(circle1.draw(1.5f, 3.0f))
    println(square1.draw(2.4f, 1.0f))
    println(dot1.draw(4, 8))

}

abstract class Screen {

    abstract fun draw(x: Int, y: Int): String
    abstract fun draw(x: Float, y: Float): String

}

class Circle(
    private val anObject: String = "Круг",
) : Screen() {
    override fun draw(x: Int, y: Int) = "Создан объект $anObject с координатами: x = $x, y = $y"

    override fun draw(x: Float, y: Float) = "Создан объект $anObject с координатами: x = $x, y = $y"
}

class Square(
    private val anObject: String = "Квадрат",
) : Screen() {
    override fun draw(x: Int, y: Int) = "Создан объект $anObject с координатами: x = $x, y = $y"
    override fun draw(x: Float, y: Float) = "Создан объект $anObject с координатами: x = $x, y = $y"
}

class Dot(
    private val anObject: String = "Точка",
) : Screen() {
    override fun draw(x: Int, y: Int) = "Создан объект $anObject с координатами: x = $x, y = $y"
    override fun draw(x: Float, y: Float) = "Создан объект $anObject с координатами: x = $x, y = $y"
}