package lesson_22

fun main() {

    val office1 = TravelAgency("Coral travel", 7, 3)
    val (name, age, employee) = office1

    println(name)
    println(age)
    println(employee)

}

data class TravelAgency(
    val name: String,
    val age: Int,
    val employee: Int,
)