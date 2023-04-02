package lesson_4

const val NO_DAMAGE = true
const val FAVORABLE_WEATHER_CONDITIONS = true

fun main() {

    val minProvision = 50
    val minCrew = 55
    val recommendedCrew = 70

    println("Есть ли повреждения корабля?")
    val shipDamage: Boolean = readln().toBoolean()
    println("Укажите кол-во экипажа")
    val crewSize = readln().toInt()
    println("Укажите кол-во провизии")
    val provisions = readln().toInt()
    println("Благоприятная ли сегодня погода?")
    val favorableWeatherToday: Boolean = readln().toBoolean()

    val result = (favorableWeatherToday == FAVORABLE_WEATHER_CONDITIONS) && (provisions > minProvision) && ((shipDamage != NO_DAMAGE) && (crewSize in (minCrew + 1)..(recommendedCrew - 1)) || (crewSize == recommendedCrew))

    println("Может ли корабль отправится в длительное плавание? Результат: $result")
}