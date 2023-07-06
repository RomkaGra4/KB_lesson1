package lesson_16

fun main(){
    val player1 = Player("Легалас", 100, 20)

    player1.takingDamage(35)
    player1.healing(15)
    player1.takingDamage(35)
    player1.healing(10)
    player1.takingDamage(60)


}

class Player(
    val name: String,
    var health: Int,
    var impactForce: Int,
) {
    fun takingDamage(hit: Int){
        health -= hit

            if (health <= 0) {
                println("Нанесен урон: уровень здоровья игрока $name = 0")
                death()
            } else {
                println("Нанесен урон: уровень здоровья игрока $name = $health")
            }
    }

    fun healing(recovery: Int){
        health += recovery
        println("Исцеление: уровень здоровья игрока $name = $health")
    }

    private fun death(){
        impactForce = 0
        health = 0
        println("$name умер...")
    }
}