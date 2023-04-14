package lesson_1_10.lesson_4

const val SUNNY_WEATHER = true
const val AWNING_OPEN = true
const val HUMIDITY = 20
const val NOT_WINTER = true

fun main() {

    val todaySunnyWeather = true
    val todayAwningOpen = true
    val humidityToday = 20
    val nowIsWinter = true

    val result =
        (todaySunnyWeather == SUNNY_WEATHER && todayAwningOpen == AWNING_OPEN && humidityToday == HUMIDITY && nowIsWinter != NOT_WINTER)

    println("Благоприятные ли условия сейчас для роста бобовых? $result")
}