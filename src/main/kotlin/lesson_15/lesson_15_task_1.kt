package lesson_15

fun main() {
    val carp1 = Carp("Карп")
    val seagull1 = Seagull("Чайка")
    val duck1 = Duck("Утка")

    carp1.swimming()
    carp1.flying()
    println()
    seagull1.swimming()
    seagull1.flying()
    println()
    duck1.swimming()
    duck1.flying()
}

abstract class Creature : Movable {

    abstract val name: String

}

class Carp(override val name: String) : Creature() {
    override fun swimming() {
        println("$name умеет плавать")
    }

    override fun flying() {
        println("$name не умеет летать")
    }
}

class Seagull(override val name: String) : Creature() {
    override fun swimming() {
        println("$name умеет плавать")
    }

    override fun flying() {
        println("$name умеет летать")
    }
}

class Duck(override val name: String) : Creature() {
    override fun swimming() {
        println("$name умеет плавать")
    }

    override fun flying() {
        println("$name умеет летать")
    }
}

interface Movable {

    fun swimming()
    fun flying()

}