package lesson_3

fun main(){

        val playerTurn = "D2-D4;0"

        val stepsAndCounter = playerTurn.split(";")
        var steps = stepsAndCounter[0]
        val stepOldAndNew = steps.split("-")
        val stepOld = stepOldAndNew[0]
        val stepNew = stepOldAndNew[1]

        val counter = steps[1]

        println("""
            $stepOld
            $stepNew
            $counter
        """.trimIndent())
    }