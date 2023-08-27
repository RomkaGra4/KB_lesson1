package lesson_20

fun main() {

    val player1 = Player(false)

    player1.openTheDoor(player1.key)
}

class Player(val key: Boolean) {

    val openTheDoor: (Boolean) -> Any = {
        if (key == true)
            println("Игрок открыл дверь")
        else
            println("Дверь заперта")
    }
}