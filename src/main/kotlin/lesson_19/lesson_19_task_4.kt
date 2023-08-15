package lesson_19

fun main(){
    val tank = Tank()

    tank.armamentAmmo(Ammunition.BLUE)
    tank.shot(Ammunition.BLUE)
    println()
    tank.armamentAmmo(Ammunition.GREEN)
    tank.shot(Ammunition.GREEN)
    println()
    tank.armamentAmmo(Ammunition.RED)
    tank.shot(Ammunition.RED)

}

enum class Ammunition{
    BLUE,
    GREEN,
    RED,
}

fun setAmmunition(ammo: Ammunition){
    when(ammo){
        Ammunition.BLUE -> println("Синие патроны")
        Ammunition.GREEN -> println("Зеленые патроны")
        Ammunition.RED -> println("Красные патроны")
    }
}

class Tank{

    fun armamentAmmo(ammo: Ammunition) {
        print("Танк вооружился боеприпасами: ")
        when(ammo){
            Ammunition.BLUE -> setAmmunition(Ammunition.BLUE)
            Ammunition.GREEN -> setAmmunition(Ammunition.GREEN)
            Ammunition.RED -> setAmmunition(Ammunition.RED)
        }
    }

    fun shot(ammo: Ammunition){
        print("Танк выстрелил! Нанесенный урон: ")
        when(ammo){
            Ammunition.BLUE -> println(5)
            Ammunition.GREEN -> println(10)
            Ammunition.RED -> println(20)
        }
    }


}