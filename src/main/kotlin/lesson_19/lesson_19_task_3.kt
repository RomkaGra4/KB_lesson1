package lesson_19

import lesson_19.Spaceship.*

fun main() {

    val spaceship1 = Spaceship()

    println(spaceship1.takeoff())
    println(spaceship1.landing())
    println(spaceship1.shootingFromAsteroids())
}

class Spaceship {
    fun takeoff(): String {
        return "Корабль взлетает"
    }

    fun landing(): String {
        TODO("Need information about additional logic")
    }

    fun shootingFromAsteroids(): String {
        TODO()
    }
}
