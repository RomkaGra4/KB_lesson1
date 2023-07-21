package lesson_18

fun main() {

    val fox1 = Fox("Корица", "ягоды")
    val dog1 = Dog("Хантер", "кости")
    val cat1 = Cat("Имбирь", "рыб")

    println(fox1.sleep())
    println(fox1.eat())
    println(fox1.play())

    println()

    println(dog1.sleep())
    println(dog1.eat())
    println(dog1.play())

    println()

    println(cat1.sleep())
    println(cat1.eat())
    println(cat1.play())

}

abstract class Tamagotchi(val name: String, val food: String) {
    open fun sleep() = "$name - спит"
    abstract fun eat(): String
    open fun play() = "$name играет"
}

class Fox(name: String, food: String) : Tamagotchi(name, food) {
    override fun eat() = "Лиса $name - ест $food"
}

class Dog(name: String, food: String) : Tamagotchi(name, food) {
    override fun eat() = "Собака $name - ест $food"
}

class Cat(name: String, food: String) : Tamagotchi(name, food) {
    override fun eat() = "Кот $name - ест $food"
}