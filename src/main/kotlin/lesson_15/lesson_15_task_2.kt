package lesson_15

fun main() {

    val message1 = Temperature(16)
    val rainfall1 = Rainfall(299)

    message1.serverConnection()
    message1.sendingData()
    rainfall1.serverConnection()
    rainfall1.sendingData()

}

abstract class Message {

    abstract val index: Int
    abstract fun serverConnection()
    abstract fun sendingData()

}

 class Temperature(override val index: Int) : Message() {
    override fun serverConnection() {
        println("Подключение к серверу...")
    }

    override fun sendingData() {
        println("Температурка: $index градусов")
    }

}

class Rainfall(override val index: Int) : Message() {
    override fun serverConnection() {
        println("Подключение к серверу...")
    }

    override fun sendingData() {
        println("Количество осадков: $index мм.")
    }

}