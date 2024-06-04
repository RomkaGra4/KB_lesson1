package lesson_22

fun main() {

    val alphaCentauri = GalacticGuide(
        "Про́ксима Цента́вра",
        "Звезда, красный карлик",
        "1915 год (дата открытия)",
        "4,244 световых лет",
    )
    println(alphaCentauri.component1())
    println(alphaCentauri.component2())
    println(alphaCentauri.component3())
    println(alphaCentauri.component4())

}

data class GalacticGuide(
    val placeOrEvent: String,
    val description: String,
    val dateAndTime: String,
    val distance: String,
)