package lesson_13

fun main() {

    val number: Long
    val strNumber = readln()
    try {
        number = strNumber.toLong()
        println(number)
    } catch (e: Exception) {
        println("Произошла ошибка! Номер может содержать только цифры!")
    }
}

