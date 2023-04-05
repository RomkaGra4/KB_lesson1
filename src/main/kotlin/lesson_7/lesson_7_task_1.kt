package lesson_7

fun main() {

    val charsRange = ('0'..'9') + ('a'..'z')

   /* val symnolOne = (charsRange).random().lowercase()
    val symnolTwo = (charsRange).random().lowercase()
    val symnolThree = (charsRange).random().lowercase()
    val symnolFour = (charsRange).random().lowercase()
    val symnolFive = (charsRange).random().lowercase()
    val symnolSix = (charsRange).random().lowercase()
    val password = symnolOne + symnolTwo + symnolThree + symnolFour + symnolFive + symnolSix
    println(password)
*/
    for (i in 1..6) {
        val i = (charsRange).random().lowercaseChar()
        print(i)
    }
}