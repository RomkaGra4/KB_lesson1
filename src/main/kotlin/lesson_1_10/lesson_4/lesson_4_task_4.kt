package lesson_1_10.lesson_4

fun main() {

    val trainingDay = 5
    val isEvenDay = trainingDay % 2 == 0

    println(
        """
        Упражнения для рук:    ${!isEvenDay} 
        Упражнения для ног:    $isEvenDay  
        Упражнения для спины:  $isEvenDay 
        Упражнения для пресса: ${!isEvenDay}
    """.trimIndent()
    )
}