package lesson_12

import kotlin.random.Random.Default.nextBoolean

fun main() {
    val listOfDays = mutableListOf<DayAndNightWeather>()

    for (i in 1..10) {
        listOfDays.add(
            DayAndNightWeather(
                dailyTemperature = (-40..50).random(),
                overnightTemperature = (-40..50).random(),
                atmospherePressure = (702..798).random(),
                wasItRaining = nextBoolean()
            )
        )
    }

    val averageDayTemperature = listOf(listOfDays.map { it.dailyTemperature }.average())
    val averageNightTemperature = listOf(listOfDays.map { it.overnightTemperature }.average())
    val averagePressure = listOf(listOfDays.map { it.atmospherePressure }.average())

    val rainyDays = listOf(listOfDays.filter { it.wasItRaining == true }.count())

    println(
        """ ***
        Средняя температура днем:     $averageDayTemperature
        Средняя температура ночью:    $averageNightTemperature
        Cреднее атмосферное давление: $averagePressure         
        Дождливых дней:               $rainyDays
        """.trimMargin()
    )
}

class DayAndNightWeather(
    val dailyTemperature: Int,
    val overnightTemperature: Int,
    val atmospherePressure: Int,
    val wasItRaining: Boolean,
)