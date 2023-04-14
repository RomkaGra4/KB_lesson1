package lesson_1_10.lesson_6

fun main() {

    println("Сколько секунд необходимо засечь? Введите кол-во: ")
    var seconds = readLine()!!.toInt()
    val userSecond = seconds

        while (seconds > 0) {
            println("${seconds--}")
            Thread.sleep(1000)
        }

    println("Прошло $userSecond секунд")

}