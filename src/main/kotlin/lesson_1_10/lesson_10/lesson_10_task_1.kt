package lesson_1_10.lesson_10

fun main(){

    println("Ход игрока:")
    val player = rollOfTheDice()
    println("Результат - $player")

    println("Ход компьютера:")
    val computer = rollOfTheDice()
    println("Результат - $computer")

    val sumPlayer = player[0] + player[1]
    val sumComputer = computer[0] + computer[1]

    println("*********************")
    if (sumPlayer > sumComputer){
        println("Победило человечество")
    } else {
        println("Победила машина")
    }
}

fun rollOfTheDice (): List<Int> {
    val playRange = 0..6
    val cubeOne = playRange.random()
    val cubeTwo = playRange.random()
    return listOf(cubeOne,cubeTwo)
}
