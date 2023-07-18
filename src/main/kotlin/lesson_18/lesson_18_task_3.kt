package lesson_18

fun main() {

    val fox1 = Fox("Корица")
    val dog1 = Dog("Хантер")
    val cat1 = Cat("Имбирь")

    println(fox1.sleep())
    println(fox1.eat())

    println()

    println(dog1.sleep())
    println(dog1.eat())

    println()

    println(cat1.sleep())
    println(cat1.eat())
}

open class Tamagotchi {
    open fun sleep() = ""
    open fun eat() = ""
}

class Fox(private val name: String) : Tamagotchi() {
    override fun sleep(): String {
        return "Лиса $name - спит"
    }

    override fun eat(): String {
        return "Лиса $name - ест ягоды"
    }
}

class Dog(private val name: String) : Tamagotchi() {
    override fun sleep(): String {
        return "Собака $name - спит"
    }

    override fun eat(): String {
        return "Собака $name - ест кости"
    }
}

class Cat(private val name: String) : Tamagotchi() {
    override fun sleep(): String {
        return "Кот $name - спит"
    }

    override fun eat(): String {
        return "Кот $name - ест рыбу"
    }
}