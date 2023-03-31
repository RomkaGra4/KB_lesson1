package lesson_3

fun main() {

    val playerTurn = "D2-D4;0"

    val stepsAndCounter = playerTurn.split(";", "-")
    var stepOld = stepsAndCounter[0]
    val stepNew = stepsAndCounter[1]
    val counter = stepsAndCounter[2]

    println(
        """
            $stepOld
            $stepNew
            $counter
        """.trimIndent()
    )
}
