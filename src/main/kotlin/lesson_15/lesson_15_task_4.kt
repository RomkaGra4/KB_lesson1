package lesson_15

fun main() {

    val instrument1 = Instruments("Гитара", 25)
    val accessory1 = Accessories("Струна", 140)

    instrument1.searchProcess()
}

abstract class MusicalInstruments {

    abstract val name: String
    abstract val quantity: Int

}

class Instruments(override val name: String, override val quantity: Int) : MusicalInstruments(), Search

class Accessories(override val name: String, override val quantity: Int) : MusicalInstruments()

interface Search {

    fun searchProcess() {
        println("Выполняется поиск")
    }
}