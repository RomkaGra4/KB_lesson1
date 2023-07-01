package lesson_16

fun main() {

    val user1 = User("Petr", "rex2025")
    user1.correctnessCheck()

}

class User(
    val login: String,
    private val password: String,
) {
    fun correctnessCheck() {

        if (password == readln())
            println("Пароль корректный")
        else
            println("Пароль НЕкорректный")
    }
}