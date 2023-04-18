package lesson_11

fun main() {
    val room1 = Room(
        cover = "Синяя",
        name = "Книжный клуб",
        listOfParticipants = listOf(
            User(name = "Роман", userStatus = "разговаривает"),
            User(name = "Ольга", userStatus = "микрофон выключен")
        )
    )

    val room2 = Room(
        cover = "Красная",
        name = "Приготовление блюд",
        listOfParticipants = listOf(
            User(name = "Анна", userStatus = "микрофон выключен"),
            User(name = "Дмитрий", userStatus = "пользователь заглушен")
        )
    )
}

class Room(
    val cover: String,
    val name: String,
    val listOfParticipants: List<User>,
)

class User(
    val name: String,
    val userStatus: String,
)
