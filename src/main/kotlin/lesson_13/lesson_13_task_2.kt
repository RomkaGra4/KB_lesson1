package lesson_13

fun main() {

    val contact = PhoneBook("Роман", 87775530012, null)

    if (contact != null) {
        if (contact.company == null) contact.company = "[не указано]"
    }

    contact?.printInformation()
}

class PhoneBook(
    val name: String,
    val number: Long,
    var company: String? = null ?: "[не указано]",
){
    fun printInformation(){
        println("Имя: $name \nНомер: $number \nКомпания: $company")
    }
}



