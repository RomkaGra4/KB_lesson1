package lesson_13

fun main() {

    val contact = PhoneBook("Роман", 87775530012, )
    contact.printInformation()

}

class PhoneBook(
    val name: String,
    val number: Long,
    val company: String? = null ?: "[не указано]",
){
    fun printInformation(){
        println("Имя: $name \nНомер: $number \nКомпания: $company")
    }
}



