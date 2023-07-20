package lesson_18

fun main() {

    val fox1 = Fox("Корица", "ягоды")
    val dog1 = Dog("Хантер", "кости")
    val cat1 = Cat("Имбирь", "рыб")

    println(fox1.sleep())
    println(fox1.eat())

    println()

    println(dog1.sleep())
    println(dog1.eat())

    println()

    println(cat1.sleep())
    println(cat1.eat())
}

abstract class Tamagotchi(val name: String, val food: String) {
    open fun sleep() = "$name - спит"
    open fun eat() = "$name - ест $food"
}

class Fox(name: String, food: String) : Tamagotchi(name, food) {
    override fun sleep() = "Лиса $name - спит"

    override fun eat() = "$name - ест $food"
    }

class Dog(name: String, food: String) : Tamagotchi(name, food) {
    override fun sleep() = "Собака $name - спит"

    override fun eat() = "Собака $name - ест $food"
}

class Cat(name: String, food: String) : Tamagotchi(name, food) {
    override fun sleep() = "Кот $name - спит"

    override fun eat() = "Кот $name - ест $food"
}