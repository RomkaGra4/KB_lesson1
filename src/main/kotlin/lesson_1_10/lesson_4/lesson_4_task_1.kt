package lesson_1_10.lesson_4

const val MAX_TABLES = 13

fun main() {

    val tableReserveToday = 13
    val tableReserveTomorrow = 9

    val bookingAvailabilityToday = tableReserveToday < MAX_TABLES
    val bookingAvailabilityTomorrow = tableReserveTomorrow < MAX_TABLES

    println("Доступность столиков на сегодня: $bookingAvailabilityToday. \nДоступность столиков на завтра: $bookingAvailabilityTomorrow.")
}

