package lesson_17

fun main() {

    val package1 = Package()
    package1.location = "Воронеж"
    package1.location = "Москва"
    package1.location = "Тверь"
    println(package1.locationCounter)

}

class Package {

    val number: Int = 1
    var location: String = "Волгоград"
        set(value) {
            field = value
            locationCounter++
        }
    var locationCounter: Int = 0

}