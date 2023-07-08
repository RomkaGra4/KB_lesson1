package lesson_17

fun main() {
    val ship1 = Ship()
    ship1.name = "Олимпик"
    println("Название корабля: ${ship1.name}")
    println("Средняя скорость: ${ship1.averageSpeed}")
    println("Порт регистрации: ${ship1.portOfResidence}")
}

class Ship {

    var name = "Титаник"
        get() = "Титаник"
        set(value) {
            field = value
            if (value != "Титаник")
                println("ВНИМАНИЕ! Вы не можете изменить название корабля!")
            field = value
        }

    val averageSpeed = 23
    val portOfResidence = "Саутгемптон"

}