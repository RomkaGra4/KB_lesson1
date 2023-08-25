package lesson_20

fun main() {

    val player1 = Player("Роман", 30, 100)
    player1.printResult()
    println(player1.currentHealth)
}

class Player(val name: String, var currentHealth: Int, val maxHealth: Int) {

    fun actionPotions(): Int {
        currentHealth += (maxHealth - currentHealth)
        return currentHealth
    }

    val printResult: () -> Unit =
        fun() = println("Игрок $name выпил лечебное зелье. Текущее здоровье игрока = ${actionPotions()}")
}