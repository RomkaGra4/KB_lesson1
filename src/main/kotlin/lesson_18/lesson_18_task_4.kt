package lesson_18

import kotlin.math.pow

fun main() {

    val package1 = Package()
    val package2 = Package()

    package1.parcelSurfaceArea(2.0)
    package2.parcelSurfaceArea(4.5, 2.0, 3.0)

}

class Package {

    fun parcelSurfaceArea(
        parcelEdge: Double,
    ) {
        val result = 6 * parcelEdge.pow(2)
        println("Площадь посылки в виде куба равна $result")
    }

    fun parcelSurfaceArea(
        length: Double,
        width: Double,
        height: Double,
    ) {
        val result = length * width * height
        println("Площадь прямоугольной посылки равна $result")
    }

}