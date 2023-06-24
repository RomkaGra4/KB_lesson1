package lesson_15

fun main() {
    val car1 = Truck("MAN 2330", 1,2)
    val car2 = PassengerCar("BMW 512", 2,0)
    val car3 = PassengerCar("Audi 121", 3, 0)

    car1.delivery()
    car1.traffic()
    car2.transportation()
    car2.traffic()
    car3.transportation()
    car3.traffic()

}

abstract class Cars() : Movement {

    abstract val name: String
    abstract val passengers: Int
    abstract val cargo: Int
}

class PassengerCar(override val name: String, override val passengers: Int, override val cargo: Int) : Cars(), TransportationOfPassengers {
    override fun traffic() {
        println("$name в пути!")
    }

    override fun transportation() {
        println("$name перевозит $passengers пассажиров")
    }

}

class Truck(override val name: String, override val passengers: Int, override val cargo: Int) : Cars(), Shipping {
    override fun traffic() {
        println("$name в пути!")
    }

    override fun delivery() {
        println("$name перевозит $cargo тонны груза и $passengers пассажира")
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