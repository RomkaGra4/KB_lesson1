package lesson_19
import lesson_19.Spaceship.*

fun main(){

    val spaceship1 = listOf(101, 102, 103)
        for (i in spaceship1){
            when(i){
                TAKEOFF.id -> setTechnique(TAKEOFF)
                LANDING.id -> setTechnique(LANDING)
                SHOOTING.id -> setTechnique(SHOOTING)
            }
        }

    println()
    println(TAKEOFF.getActionDescription())
    println(LANDING.getActionDescription())
    println(SHOOTING.getActionDescription())

}

enum class Spaceship(val id: Int){
    TAKEOFF(101) {
        override fun getActionDescription(): String {
            return "Корабль взлетает"
        }
    },
    LANDING(102) {
        override fun getActionDescription(): String {
            TODO("Need information about additional logic")
        }
    },
    SHOOTING(103) {
        override fun getActionDescription(): String {
            TODO()
        }
    };

    abstract fun getActionDescription(): String
}

fun setTechnique(action: Spaceship){
    when(action){
        TAKEOFF -> println("Взлет")
        LANDING -> println("Приземление")
        SHOOTING -> println("Стрельба по астероидам!")
    }
}