package lesson_21

import java.io.File

fun main() {

    val file = File("")
    file.evenNumbersSum()

}

fun File.evenNumbersSum() {

    val numbers = listOf(5, 3, 2, 4, 6)
    var result = 0

    for (i in numbers)
        if (i % 2 == 0)
            result += i

    println(result)
}