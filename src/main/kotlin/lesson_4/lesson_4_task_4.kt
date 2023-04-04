package lesson_4

fun main() {

    val trainingDay = 5
    val evenNumber = trainingDay % 2 == 0

    println(
        """
        Упражнения для рук:    ${!evenNumber} 
        Упражнения для ног:    $evenNumber  
        Упражнения для спины:  $evenNumber 
        Упражнения для пресса: ${!evenNumber}
    """.trimIndent()
    )
}