package lesson_19

fun main() {

    val listOfFish = listOf(101, 102, 103, 104)

    println("Вы можете добавить в свой аквариум следующих рыбок:")
    for (i in listOfFish) {
        when (i) {
            101 -> setFish(Fish.GUPPY)
            102 -> setFish(Fish.ANGELFISH)
            103 -> setFish(Fish.GOLDFISH)
            104 -> setFish(Fish.SIAMESE_FIGHTING_FISH)
        }
    }
}

enum class Fish {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH,
}

fun setFish(fish: Fish) {
    when (fish) {
        Fish.GUPPY -> println("рыбка Гуппи")
        Fish.ANGELFISH -> println("рыбка скалярия")
        Fish.GOLDFISH -> println("золотая рыбка")
        Fish.SIAMESE_FIGHTING_FISH -> println("рыбка-петушок")
    }
}