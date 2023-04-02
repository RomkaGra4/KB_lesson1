package lesson_4

fun main() {

    val trainingDay = 5
    val armAndAbsExercises = trainingDay % 2 != 0
    val legAndBackExercises = trainingDay % 2 == 0

    println(
        """
        Упражнения для рук:    $armAndAbsExercises 
        Упражнения для ног:    $legAndBackExercises   
        Упражнения для спины:  $legAndBackExercises
        Упражнения для пресса: $armAndAbsExercises
    """.trimIndent()
    )
}