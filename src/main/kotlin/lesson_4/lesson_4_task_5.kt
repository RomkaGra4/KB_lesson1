package lesson_4

const val NO_DAMAGE = true
const val FAVORABLE_WEATHER_CONDITIONS = true

fun main() {

    println("Есть ли повреждения корабля?")
    val shipDamage: Boolean = readLine()!!.toBoolean()
    println("Укажите кол-во экипажа")
    val crewSize = readln()!!.toInt()
    println("Укажите кол-во провизии")
    val provisions = readln()!!.toInt()
    println("Благоприятная ли сегодня погода?")
    val favorableWeatherToday: Boolean = readLine()!!.toBoolean()

    val result =
        ((((shipDamage != NO_DAMAGE) && ((55 < crewSize) && (crewSize < 70))) && provisions > 50) && favorableWeatherToday == FAVORABLE_WEATHER_CONDITIONS)

                ||

                (((crewSize == 70) && favorableWeatherToday == FAVORABLE_WEATHER_CONDITIONS) && provisions > 50)

    println("Может ли корабль отправится в длительное плавание? Результат: $result")
}