package lesson_21

fun main() {

    val list = listOf(5, 3, 2, 4, 6, 4).evenNumbersSum()

}

fun List<Int>.evenNumbersSum() {

    var result = 0

    for (i in this)
        if (i % 2 == 0)
            result += i

    println(result)
}