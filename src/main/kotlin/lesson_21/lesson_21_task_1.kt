package lesson_21

fun main() {

    val str = "hello".vowelCount()

}

fun String.vowelCount() {

    val vowels = listOf("a", "e", "i", "o", "y")
    var vowelsInStr = 0

    for (i in this.split(""))
        if (i in vowels)
            vowelsInStr++

    println(vowelsInStr)
}

