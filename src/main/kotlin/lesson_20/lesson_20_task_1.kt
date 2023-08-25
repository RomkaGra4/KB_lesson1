package lesson_20

fun main() {

    val username = "Роман"

    val printCongratulationWithLambda: () -> Unit

    printCongratulationWithLambda = {
        println("С наступающим Новым Годом, $username!»")
    }

    printCongratulationWithLambda()

}