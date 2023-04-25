package lesson_13

fun main() {

    val contact = PhoneBookContact("Роман", 87775530012, null)

    contact.printInformation()
}

class PhoneBookContact(
    val name: String,
    val number: Long,
    var company: String? = null ?: "[не указано]",
){
    fun printInformation(){
        println("Имя: $name \nНомер: $number \nКомпания: $company")
    }
}



