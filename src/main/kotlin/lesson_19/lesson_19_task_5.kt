package lesson_19

fun main() {

    val listOfUsers = mutableListOf<Human>()

    println("Введите данные 5х пользователей в следующем формате: имя, пол")
    println("Пол пользователя: 100 - мужчина, 101 - женщина")

    for (i in 1..5) {
        listOfUsers.add(Human(readln(), readln().toInt()))
    }

    println("Список пользователей (ниже): ")
    for (i in 0 until listOfUsers.size) {
        println("Пользователь №${i + 1} - ${listOfUsers[i].name}, ${listOfUsers[i].gender}")
    }

}

class Human(val name: String?, gender: Int) {

    var gender = when (gender) {
        Genders.MALE.id -> setGenders(Genders.MALE)
        Genders.FEMALE.id -> setGenders(Genders.FEMALE)
        else -> "пол не указан"
    }
}

enum class Genders(val id: Int) {
    MALE(100),
    FEMALE(101);
}

fun setGenders(gender: Genders): String {
    val result = when (gender) {
        Genders.MALE -> "мужчина"
        Genders.FEMALE -> "женщина"
    }
    return result
}