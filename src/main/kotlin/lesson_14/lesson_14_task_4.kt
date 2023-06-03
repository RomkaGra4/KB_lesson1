package lesson_14

fun main() {

    val sputnik1 = Sputnik("Фобос", false, false, false, true)
    val sputnik2 = Sputnik("Деймос", false, false, false, true)
    val planet = Planet("Марс", false, false, true, true, listOf(sputnik1, sputnik2))

    planet.printInfo()

}

open class HeavenlyBody(
    val inhabited: Boolean,
    val atmosphere: Boolean,
    val water: Boolean,
    val suitableForLanding: Boolean,
)

class Planet(
    val name: String,
    inhabited: Boolean,
    atmosphere: Boolean,
    water: Boolean,
    suitableForLanding: Boolean,
    val sputniks: List<Sputnik>,
) : HeavenlyBody(inhabited, atmosphere, water, suitableForLanding) {

    fun printInfo() {
        println("Платена $name имеет следующие спутники: $sputniks")

    }
}

class Sputnik(
    val name: String,
    inhabited: Boolean,
    atmosphere: Boolean,
    water: Boolean,
    suitableForLanding: Boolean,
) : HeavenlyBody(inhabited, atmosphere, water, suitableForLanding)