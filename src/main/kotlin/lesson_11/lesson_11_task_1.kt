package lesson_11

fun main() {

    val user1 = UserData(
        id = 1,
        login = "Роман",
        password = "roro515",
        email = "roman945@mail.ru"
    )

    val user2 = UserData(
        id = 2,
        login = "Оксана",
        password = "paparazzi321",
        email = "oxigen96@gmail.com"
    )

    println(
        """"Данные пользователья User 1:
        ID - ${user1.id}
        Логин - ${user1.login}
        Пароль - ${user1.password}
        Email - ${user1.email}
    """.trimIndent()
    )

    println(
        """"Данные пользователья User 2:
        ID - ${user2.id}
        Логин - ${user2.login}
        Пароль - ${user2.password}
        Email - ${user2.email}
    """.trimIndent()
    )
}

class UserData(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
) {

}