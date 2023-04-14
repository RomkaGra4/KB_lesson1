package lesson_1_10.lesson_2
    fun main (){

        val hourDepatrure = 9
        val minuteDeparture = 39
        val travelTime= 457

        val departure = (hourDepatrure * 60) + minuteDeparture
        val hour = (departure + travelTime) / 60
        val min = (departure + travelTime) % 60

        println("$hour:$min")
    }