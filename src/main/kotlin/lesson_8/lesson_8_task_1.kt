package lesson_8

fun main() {

    val advertisingForTheWeek = arrayOf(34, 55, 93, 104, 32, 56, 99)
    var sumAdvertising = 0

    for (i in advertisingForTheWeek) {
        sumAdvertising += i
    }

    println("Просмотров за неделю: $sumAdvertising")
}