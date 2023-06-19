package lesson_15

fun main() {
    val carp1 = Carp("Карп")
    val seagull1 = Seagull("Чайка")
    val duck1 = Duck("Утка")

}

class Carp(val name: String) : Swim {
    override fun swimming() {
        println("$name умеет плавать")
    }
}

class Seagull(val name: String) : Swim, Fly {
    override fun swimming() {
        println("$name умеет плавать")
    }

    override fun flying() {
        println("$name умеет летать")
    }
}

class Duck(val name: String) : Swim, Fly {
    override fun swimming() {
        println("$name умеет плавать")
    }

    override fun flying() {
        println("$name умеет летать")
    }
}

interface Swim {

    fun swimming()
}

interface Fly {

    fun flying()

}