package lesson_14

fun main() {

    val ship1 = OrdinaryShip("Victory", 15, 100)
    val ship2 = OrdinaryShip("Syndicate", 25, 35)

    ship1.speedInformation()
    ship1.cargoInformation()
    ship2.speedInformation()
    ship2.cargoInformation()

}

open class OrdinaryShip(
    val name: String,
    val speed: Int,
    val box: Int,
) {

    fun speedInformation() {
        println("Корабль $name движется со скоростью $speed узлов.")
    }

    fun cargoInformation() {
        println("Корабль $name перевозит $box ящиков груза.")
    }
}

