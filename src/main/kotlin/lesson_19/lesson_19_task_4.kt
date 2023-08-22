package lesson_19

fun main(){
    val tank = Tank(null)

    tank.installProjectile(Ammunition.BLUE)
    println(tank.shot())
    tank.installProjectile(Ammunition.RED)
    println(tank.shot())
    tank.installProjectile(Ammunition.GREEN)
    println(tank.shot())

}

enum class Ammunition(val damage: Int){
    BLUE(5),
    GREEN(10),
    RED(20),
}

fun setAmmunition(ammo: Ammunition): String {
    when(ammo){
        Ammunition.BLUE -> println("Синие патроны")
        Ammunition.GREEN -> println("Зеленые патроны")
        Ammunition.RED -> println("Красные патроны")
    }
    return ammo.damage.toString()
}

class Tank(var armament: String?){

    fun installProjectile(ammo: Ammunition) {
        print("Танк вооружился боеприпасами: ")
        armament = when(ammo){
            Ammunition.BLUE -> setAmmunition(Ammunition.BLUE)
            Ammunition.GREEN -> setAmmunition(Ammunition.GREEN)
            Ammunition.RED -> setAmmunition(Ammunition.RED)
        }
    }
    fun shot() = "Танк выстрелил! Нанесенный урон: $armament"
}