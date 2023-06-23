package lesson_15

fun main() {
    val carp1 = Carp("Карп")
    val seagull1 = Seagull("Чайка")
    val duck1 = Duck("Утка")

}

class Carp(val name: String) : Swimming {
    override fun swim() {
        println("$name умеет плавать")
    }
}

class Seagull(val name: String) : Swimming, Flying {
    override fun swim() {
        println("$name умеет плавать")
    }

    override fun fly() {
        println("$name умеет летать")
    }
}

class Duck(val name: String) : Swimming, Flying {
    override fun swim() {
        println("$name умеет плавать")
    }

    override fun fly() {
        println("$name умеет летать")
    }
}

interface Swimming {

    fun swim()
}

interface Flying {

    fun fly()

}