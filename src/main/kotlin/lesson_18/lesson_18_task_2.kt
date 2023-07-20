package lesson_18

fun main(){
    val dice1:FourSidedDice = FourSidedDice()
    val dice2:SixSidedDice = SixSidedDice()
    val dice3:EightSidedDice = EightSidedDice()

    println(dice1.getNumberDice())
    println(dice2.getNumberDice())
    println(dice3.getNumberDice())

}

abstract class Dice {

    open fun getNumberDice() = ""

}

class FourSidedDice(private val number: Int = 4): Dice(){
    override fun getNumberDice(): String {
        val range = 1..number
        val result = range.random()
        return "В четырехгранном кубике выпало число $result"
    }
}

class SixSidedDice(private val number: Int = 6): Dice(){
    override fun getNumberDice(): String {
        val range = 1..number
        val result = range.random()
        return "В шестигранном кубике выпало число $result"
    }
}

class EightSidedDice(private val number: Int = 8): Dice(){
    override fun getNumberDice(): String {
        val range = 1..number
        val result = range.random()
        return "В восьмигранном кубике выпало число $result"
    }
}