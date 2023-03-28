package lesson_2

    fun main (){

        val departure = (9 * 60) + 39
        val travelTime = 457

        val hour = (departure + travelTime) / 60
        val min = (departure + travelTime) % 60

        println("$hour:$min")



    }