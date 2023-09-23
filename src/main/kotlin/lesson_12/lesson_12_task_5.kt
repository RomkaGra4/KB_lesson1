package lesson_12

import kotlin.random.Random.Default.nextBoolean

fun main() {
    val listOfDays = mutableListOf(DayAndNightWeather())

    var rainyDay = 0

    for (i in 1..10) {
        listOfDays.add(
            DayAndNightWeather(
                dailyTemperature = listOfDays[i - 1].dailyTemperature,
                overnightTemperature = listOfDays[i - 1].overnightTemperature,
                atmospherePressure = listOfDays[i - 1].atmospherePressure,
            )
        )
        if (listOfDays[i - 1].wasItRaining == true)
            rainyDay++
    }

    val averageDayTemperature = listOf(DayAndNightWeather().dailyTemperature).average()
    val averageNightTemperature = listOf(DayAndNightWeather().overnightTemperature).average()
    val averagePressure = listOf(DayAndNightWeather().atmospherePressure).average()

    println(
        """ ***
        Средняя температура днем:     $averageDayTemperature
        Средняя температура ночью:    $averageNightTemperature
        Cреднее атмосферное давление: $averagePressure
        Дождливых дней:               $rainyDay
        """.trimMargin()
    )
}

class DayAndNightWeather(
    val dailyTemperature: Int = (-40..50).random(),
    val overnightTemperature: Int = (-40..50).random(),
    val atmospherePressure: Int = (702..798).random(),
    val wasItRaining: Boolean = nextBoolean(),
)