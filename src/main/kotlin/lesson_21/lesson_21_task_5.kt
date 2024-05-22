package lesson_21

fun main() {

    val skill = mapOf(
        ("Power" to 300),
        ("Speed" to 300)
    ).maxCategory()

}

fun Map<String, Int>.maxCategory() {

    val skill = this.maxByOrNull { it.value }

    println(skill?.key)

}