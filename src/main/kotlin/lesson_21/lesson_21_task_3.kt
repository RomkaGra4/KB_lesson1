package lesson_21

fun main(){

    val player = Player(100, 100).isHealthy()

}

class Player(var currentHealth: Int,val maxHealth: Int)

fun Player.isHealthy(){

    print(this.currentHealth == this.maxHealth)


}
