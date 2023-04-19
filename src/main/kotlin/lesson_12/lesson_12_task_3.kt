package lesson_12

fun main() {

    val day1 = Day(15, 10, 750)
    val day2 = Day(10, 14, 740)
    val day3 = Day(-3, 7, 747)

    day1.printInformation()
    day2.printInformation()
    day3.printInformation()

}

class Day(
    val dailyTemperature: Int,
    val overnightTemperature: Int,
    val atmospherePressure: Int,
    val wasItRaining: Boolean = false,
) {

    fun printInformation() {
        println(
            """ ***
        Дневная температура: $dailyTemperature
        Ночная температура: $overnightTemperature
        Был ли дождь: $wasItRaining
        Атмосферное давление: $atmospherePressure
        """.trimMargin()
        )
    }
}