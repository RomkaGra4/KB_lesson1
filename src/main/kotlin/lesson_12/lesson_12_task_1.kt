package lesson_12

fun main() {

    val day1 = Weather()
    day1.dailyTemperature = -12
    day1.overnightTemperature = 1
    day1.wasItRaining = true
    day1.atmospherePressure = 740

    val day2 = Weather()
    day2.dailyTemperature = 6
    day2.overnightTemperature = 15
    day2.atmospherePressure = 747

    day1.printInformation()
    day2.printInformation()
}

class Weather() {

    var dailyTemperature = 0
    var overnightTemperature = 0
    var atmospherePressure = 0
    var wasItRaining: Boolean = false

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