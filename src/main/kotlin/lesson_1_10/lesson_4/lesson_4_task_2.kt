package lesson_1_10.lesson_4

const val MIN_AVERAGE_WEIGHT = 35
const val MAX_AVERAGE_WEIGHT = 100
const val AVERAGE_VOLUME = 100

fun main() {

    val cargoOneWeight = 20
    val cargoOneVolume = 80

    val cargoTwoWeight = 50
    val cargoTwoVolume = 100

    println("Average для груза с весом $cargoOneWeight кг и объемом $cargoOneVolume л: ${((MIN_AVERAGE_WEIGHT <= cargoOneWeight) && (cargoOneWeight <= MAX_AVERAGE_WEIGHT)) && (cargoOneVolume < AVERAGE_VOLUME)}")
    println("Average для груза с весом $cargoTwoWeight кг и объемом $cargoTwoVolume л: ${((MIN_AVERAGE_WEIGHT <= cargoTwoWeight) && (cargoTwoWeight <= MAX_AVERAGE_WEIGHT)) && (cargoTwoVolume < AVERAGE_VOLUME)}")
}