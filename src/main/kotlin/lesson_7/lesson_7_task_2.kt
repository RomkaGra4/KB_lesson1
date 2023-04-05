package lesson_7

fun main() {

    do {
        val randomCode = (1000..9999).random()
        println("Ваш код авторизации: $randomCode")

        println("Введите КОД для авторизации: ")
        val userCode = readln().toInt()
        if (userCode != randomCode) {
            continue
        } else {
            println("КОД введен верно! Приветствуем Вас! ;)")
        }
    } while (userCode != randomCode)
}