package lesson_21

fun main() {

    val string = String()
    string.vowelCount()

}

fun String.vowelCount() {

    val text = "hello"
    val vowels = listOf("a", "e", "i", "o", "y")
    val textSplit = text.split("")

    for (i in textSplit)
        if (i in vowels)
            print(i)
}

