package lesson_20

fun main() {
    val phrases = RobotSay(
        mutableListOf(
            "Первая фраза робота",
            "Вторая фраза робота",
            "Третья фраза робота",
            "Четвертая фраза робота",
            "Пятая фраза робота"
        )
    )

    phrases.say()

}

class RobotSay(var phrase: MutableList<String>) {

    fun setModifier(): String {
        return phrase[(0 until phrase.size).random()]
    }

    val say: () -> Unit = {

        println("Выбрана рандомная фраза: ${setModifier()}")
    }
}


