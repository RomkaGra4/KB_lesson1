package lesson_19

fun main() {

    val listOfUsers = mutableListOf<Human>()

    println("Введите данные 5х пользователей в следующем формате: имя, пол")
    println("Пол пользователя: male или female")

    for (i in 1..5) {
        listOfUsers.add(Human(readln(), readLine().toString()))
    }

    println("Список пользователей (ниже): ")
    for (i in 0 until listOfUsers.size) {
        println("Пользователь №${i + 1} - ${listOfUsers[i].name}, ${listOfUsers[i].gender}")
    }

}

class Human(val name: String?, gender: String) {

    var gender = when (gender.toUpperCase()) {
        Gender.MALE.textGender -> setGenders(Gender.MALE)
        Gender.FEMALE.textGender -> setGenders(Gender.FEMALE)
        else -> "Пол не определен! Введите данные повторно."
    }
}

enum class Gender(val textGender: String?) {
    MALE("MALE"),
    FEMALE("FEMALE");
}

fun setGenders(gender: Gender): String {
    val result = when (gender) {
        Gender.MALE -> "мужчина"
        Gender.FEMALE -> "женщина"
    }
    return result
}