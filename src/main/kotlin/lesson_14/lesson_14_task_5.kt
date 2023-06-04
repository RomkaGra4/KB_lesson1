package lesson_14

import kotlin.math.PI
import kotlin.math.sqrt

const val RED_FIGURE = "красный"
const val GREEN_FIGURE = "зеленый"
const val BLACK_FIGURE = "черный"

fun main() {
    val circle1 = Circle(RED_FIGURE, 10.0)
    val circle2 = Circle(BLACK_FIGURE, 20.5)
    val rectangle1 = Rectangle(BLACK_FIGURE, 13.2, 27.0)
    val rectangle2 = Rectangle(GREEN_FIGURE, 6.5, 9.0)
    val triangle1 = Triangle(GREEN_FIGURE, 6.0, 5.4, 4.2)
    val triangle2 = Triangle(RED_FIGURE, 5.0, 5.0, 5.0)
    val arrayOfFigure = arrayOf(circle1, circle2, rectangle1, rectangle2, triangle1, triangle2)

    println(sumOfPerimeterRedFigure(arrayOfFigure))
    println(sumOfSquareRedFigure(arrayOfFigure))

}

abstract class Figure(
    val color: String,
) {
    abstract fun squareFigure(): Double

    abstract fun perimeterFigure(): Double
}

class Circle(
    color: String,
    val circleRadius: Double,
) : Figure(color) {
    override fun squareFigure(): Double {
        return PI * (circleRadius * circleRadius)
    }

    override fun perimeterFigure(): Double {
        return 2 * PI * circleRadius
    }
}

class Rectangle(
    color: String,
    val width: Double,
    val height: Double,
) : Figure(color) {
    override fun squareFigure(): Double {
        return width * height
    }

    override fun perimeterFigure(): Double {
        return (width + height) * 2
    }
}

class Triangle(
    color: String,
    val side1: Double,
    val side2: Double,
    val side3: Double,
) : Figure(color) {
    override fun squareFigure(): Double {
        val semiPerimeter = (side1 + side2 + side3) / 2
        return sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3))
    }

    override fun perimeterFigure(): Double {
        return side1 + side2 + side3
    }
}

fun sumOfPerimeterRedFigure(arrayOfFigure: Array<Figure>): Double {
    var sum: Double = 0.0
    for (i in 0 until arrayOfFigure.size)
        if (arrayOfFigure[i].color == RED_FIGURE)
            sum += arrayOfFigure[i].perimeterFigure()
    return sum
}

fun sumOfSquareRedFigure(arrayOfFigure: Array<Figure>): Double {
    var sum: Double = 0.0
    for (i in 0 until arrayOfFigure.size)
        if (arrayOfFigure[i].color == RED_FIGURE)
            sum += arrayOfFigure[i].squareFigure()
    return sum
}