  package lesson_19

fun main() {

    val listOfFish = listOf(101, 102, 103, 104)

    println("Вы можете добавить в свой аквариум следующих рыбок:")
    for (i in listOfFish) {
        when (i) {
            Fish.GUPPY.id -> setFish(Fish.GUPPY)
            Fish.ANGELFISH.id -> setFish(Fish.ANGELFISH)
            Fish.GOLDFISH.id -> setFish(Fish.GOLDFISH)
            Fish.SIAMESE_FIGHTING_FISH.id -> setFish(Fish.SIAMESE_FIGHTING_FISH)
        }
    }
}

enum class Fish(val id: Int) {
    GUPPY(101),
    ANGELFISH(102),
    GOLDFISH(103),
    SIAMESE_FIGHTING_FISH(104),
}

fun setFish(fish: Fish) {
    when (fish) {
        Fish.GUPPY -> println("рыбка Гуппи")
        Fish.ANGELFISH -> println("рыбка скалярия")
        Fish.GOLDFISH -> println("золотая рыбка")
        Fish.SIAMESE_FIGHTING_FISH -> println("рыбка-петушок")
    }
}