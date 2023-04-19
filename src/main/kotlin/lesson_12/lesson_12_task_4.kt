package lesson_12

fun main() {

    val day1 = DayWeather(15, 10, 750)
    val day2 = DayWeather(10, 14, 740)
    val day3 = DayWeather(-3, 7, 747)

}

class DayWeather(
    dailyTemperature: Int,
    overnightTemperature: Int,
    atmospherePressure: Int,
    wasItRaining: Boolean = false,
) {

    init {
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