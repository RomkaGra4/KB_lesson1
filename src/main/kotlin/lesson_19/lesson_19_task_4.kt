package lesson_19

fun main(){
    val tank = Tank(null)

    tank.armamentAmmo(Ammunition.BLUE)
    println(Ammunition.BLUE.shot())
    println()

    tank.armamentAmmo(Ammunition.GREEN)
    println(Ammunition.GREEN.shot())
    println()

    tank.armamentAmmo(Ammunition.RED)
    println(Ammunition.RED.shot())
}

enum class Ammunition{
    BLUE {
        override fun shot(): String {
            return "Танк выстрелил! Нанесенный урон: 5"
        }
    },
    GREEN {
        override fun shot(): String {
            return "Танк выстрелил! Нанесенный урон: 10"
        }
    },
    RED {
        override fun shot(): String {
            return "Танк выстрелил! Нанесенный урон: 20"
        }
    };

    abstract fun shot() : String
}

fun setAmmunition(ammo: Ammunition){
    when(ammo){
        Ammunition.BLUE -> println("Синие патроны")
        Ammunition.GREEN -> println("Зеленые патроны")
        Ammunition.RED -> println("Красные патроны")
    }
}

class Tank(val armament: String?){

    fun armamentAmmo(ammo: Ammunition) {
        print("Танк вооружился боеприпасами: ")
        when(ammo){
            Ammunition.BLUE -> setAmmunition(Ammunition.BLUE)
            Ammunition.GREEN -> setAmmunition(Ammunition.GREEN)
            Ammunition.RED -> setAmmunition(Ammunition.RED)
        }
    }
}