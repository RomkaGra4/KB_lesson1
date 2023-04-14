package lesson_1_10.lesson_10

fun main(){

    do {
        println("Ход игрока:")
        val player = rollOfTheDice()
        println("Результат - $player")

        println("Ход компьютера:")
        val computer = rollOfTheDice()
        println("Результат - $computer")

        winnerIs(player,computer)
        println("Хотите бросить кости еще раз Введите Да или Нет")
            val answer = readln()

    } while (answer == "Да")


}

fun winnerIs(player: List<Int>, computer: List<Int>) {
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