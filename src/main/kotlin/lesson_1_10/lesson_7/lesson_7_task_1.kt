package lesson_1_10.lesson_7

fun main() {

    val charsRange = ('0'..'9') + ('a'..'z')

    val symnolOne = (charsRange).random().lowercase()
    val symnolTwo = (charsRange).random().lowercase()
    val symnolThree = (charsRange).random().lowercase()
    val symnolFour = (charsRange).random().lowercase()
    val symnolFive = (charsRange).random().lowercase()
    val symnolSix = (charsRange).random().lowercase()
    println("$symnolOne$symnolTwo$symnolThree$symnolFour$symnolFive$symnolSix")
}