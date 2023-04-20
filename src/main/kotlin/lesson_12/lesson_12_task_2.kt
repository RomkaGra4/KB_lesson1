package lesson_12

fun main() {

    val day1 = AboutWeather(-12, 1, 740, true)
    val day2 = AboutWeather(-16, 3, 747, true)
    val day3 = AboutWeather(2, 10, 730, false)

    day1.printInformation()
    day2.printInformation()
    day3.printInformation()
}

class AboutWeather(
    _dailyTemperature: Int,
    _overnightTemperature: Int,
    _atmospherePressure: Int,
    _wasItRaining: Boolean
) {

    val dailyTemperature = _dailyTemperature
    val overnightTemperature = _overnightTemperature
    val atmospherePressure = _atmospherePressure
    val wasItRaining = _wasItRaining

    fun printInformation() {
        println(
            """Объект создан! 
        Дневная температура: $dailyTemperature
        Ночная температура: $overnightTemperature
        Был ли дождь: $wasItRaining
        Атмосферное давление: $atmospherePressure
        """.trimMargin()
        )
    }
}

