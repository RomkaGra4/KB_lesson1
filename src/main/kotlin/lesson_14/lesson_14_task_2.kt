package lesson_14

fun main() {

    val ship1 = CargoShip("Victory", 15, 100, 70, 30)
    val ship2 = Icebreaker("Syndicate", 25, 35)

    ship1.speedInformation()
    ship1.cargoInformation()
    ship1.cargoCategoryInformation()
    println()
    ship2.speedInformation()
    ship2.cargoInformation()
    ship2.breakingIce()

}

open class StandartShip(
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

class CargoShip(
    name: String,
    speed: Int,
    box: Int,
    val foodCargo: Int,
    val nonFoodCargo: Int,
) : StandartShip(name, speed, box) {

    fun cargoCategoryInformation() {
        println("У грузового корабля $name в настоящий момент $foodCargo ящиков категории \"Продукты\" и $nonFoodCargo ящиков категории \"Товары народного потребления\"")
    }
}

class Icebreaker(
    name: String,
    speed: Int,
    box: Int,
    val reinforcedBody: Boolean = true,

    ) : StandartShip(name, speed, box) {

    fun breakingIce() {
        println("Ледокол $name может колоть лёд.")
    }

}