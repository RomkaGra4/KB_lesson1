package lesson_1_10.lesson_1

    fun main(){

        val timeInSpace = 6480
        val minuteInSpace = timeInSpace / 60
        val secondInSpace = timeInSpace % 60

        println(String.format("%02d:%02d", minuteInSpace, secondInSpace))

    }