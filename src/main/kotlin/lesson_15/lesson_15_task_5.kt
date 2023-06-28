package lesson_15

fun main() {
    val car1 = Truck("MAN 2330", 1,2)
    val car2 = PassengerCar("BMW 512", 2,0)
    val car3 = PassengerCar("Audi 121", 3, 0)

    car1.runDeliver()
    car1.startMoving()
    car2.runDeliverOfPassengers()
    car2.startMoving()
    car3.runDeliverOfPassengers()
    car3.startMoving()

}

abstract class Cars() : Movement {

    abstract val name: String
    abstract val passengers: Int
    abstract val cargo: Int
}

class PassengerCar(
    override val name: String,
    override val passengers: Int,
    override val cargo: Int) : Cars(), TransportationOfPassengers {
    override fun startMoving() {
        println("$name в пути!")
    }

    override fun runDeliverOfPassengers() {
        println("$name перевозит $passengers пассажиров")
    }

}

class Truck(override val name: String, override val passengers: Int, override val cargo: Int) : Cars(), Shipping {
    override fun startMoving() {
        println("$name в пути!")
    }

    override fun runDeliver() {
        println("$name перевозит $cargo тонны груза и $passengers пассажира")
    }

}

interface Movement {
    fun startMoving()
}

interface TransportationOfPassengers {
    fun runDeliverOfPassengers()
}

interface Shipping {
    fun runDeliver()
}