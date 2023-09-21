package lesson_12

import kotlin.random.Random.Default.nextBoolean

fun main() {
    val listOfDays = mutableListOf<DayAndNightWeather>()
    for (i in 1..10) {
        listOfDays.add(DayAndNightWeather())
    }

    var averageDayTemperature = 0
    for (i in 1..10) {
        averageDayTemperature += listOfDays[i - 1].dailyTemperature
    }

    var averageNightTemperature = 0
    for (i in 1..10) {
        averageNightTemperature += listOfDays[i - 1].overnightTemperature
    }

    var averagePressure = 0
    for (i in 1..10) {
        averagePressure += listOfDays[i - 1].atmospherePressure
    }

    var rainyDay = 0
    for (i in 1..10) {
        if (listOfDays[i - 1].wasItRaining == true)
            rainyDay++
    }

    println(
        """ ***
        Средняя температура днем:     ${averageDayTemperature / listOfDays.size}
        Средняя температура ночью:    ${averageNightTemperature / listOfDays.size}
        Cреднее атмосферное давление: ${averagePressure / listOfDays.size}
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