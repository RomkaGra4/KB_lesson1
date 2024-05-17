package lesson_21

fun main() {

    val skill = mapOf(
        ("Power" to 200),
        ("Speed" to 300)
    ).maxCategory()

}

fun Map<String, Int>.maxCategory() {

    var maxValue = 0
    for (i in this)
        if (i.value > maxValue)
            maxValue = i.value

    val skill = this.filter { it.value == maxValue }

    println(skill.keys)

}