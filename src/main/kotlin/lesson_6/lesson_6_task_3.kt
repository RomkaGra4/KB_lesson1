package lesson_6

fun main() {

    println("Сколько секунд необходимо засечь? Введите кол-во: ")
    var seconds = readln().toInt()

    while (seconds > 0) {
        println("Осталось секунд: ${seconds--}")
        Thread.sleep(1000)
    }

    println("Ваше время вышло")

}