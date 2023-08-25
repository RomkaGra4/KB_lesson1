package lesson_20

fun main() {

    val player1 = Player(false)
    player1.openTheDoor()

}

class Player(val key: Boolean) {

    fun openTheDoor(): Any = if (key == true)
        println("Игрок открыл дверь")
    else
        println("Дверь заперта")
}