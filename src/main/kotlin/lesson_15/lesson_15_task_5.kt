package lesson_15

fun main() {
    val car1 = Truck("MAN 2330")
    val car2 = PassengerCar("BMW 512")
    val car3 = PassengerCar("Audi 121")

    car1.delivery()
    car1.traffic()
    car2.transportation()
    car2.traffic()
    car3.transportation()
    car3.traffic()

}

abstract class Cars() : Movement {

    abstract val name: String
}

class PassengerCar(override val name: String) : Cars(), TransportationOfPassengers {
    override fun traffic() {
        println("$name в пути!")
    }

    override fun transportation() {
        println("$name перевозит 3 пассажиров")
    }

}

class Truck(override val name: String) : Cars(), Shipping {
    override fun traffic() {
        println("$name в пути!")
    }

    override fun delivery() {
        println("$name перевозит 2 тонны груза и 1 пассажира")
    }

}

interface Movement {
    fun traffic()
}

interface TransportationOfPassengers {
    fun transportation()
}

interface Shipping {
    fun delivery()
}