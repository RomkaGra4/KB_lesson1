package lesson_12

import kotlin.random.Random.Default.nextBoolean

fun main() {
    val listOfDays = mutableListOf<DayAndNightWeather>()
    val averageDayTemperature = mutableListOf<Int>()
    val averageNightTemperature = mutableListOf<Int>()
    val averagePressure = mutableListOf<Int>()
    var rainyDay = 0

    for (i in 1..10) {
        listOfDays.add(DayAndNightWeather())
        averageDayTemperature.add(listOfDays[i - 1].dailyTemperature)
        averageNightTemperature.add(listOfDays[i - 1].overnightTemperature)
        averagePressure.add(listOfDays[i - 1].atmospherePressure)
        if (listOfDays[i - 1].wasItRaining == true)
            rainyDay++
    }

    println(
        """ ***
        Средняя температура днем:     ${averageDayTemperature.average()}
        Средняя температура ночью:    ${averageNightTemperature.average()}
        Cреднее атмосферное давление: ${averagePressure.average().toInt()}
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