package lesson_13

fun main() {

    val contact1 = TelephoneBook(name = "Роман", company = "FM Logistic")
    val contact2 = TelephoneBook(name = "Ольга", number = "89605537705")
    val contact3 = TelephoneBook(number = "89165520202", company = "Pepsi Co")

    val contactsList = listOf(contact1, contact2, contact3)
    printInformation(contactsList)

}

class TelephoneBook(
    val name: String? = null ?: "[не указано]",
    val number: String? = null ?: "[не указано]",
    val company: String? = null ?: "[не указано]",
)

fun printInformation(contactsList: List<TelephoneBook>) {

    for (element in contactsList)
        println("Имя: ${element.name} \nНомер: ${element.number} \nКомпания: ${element.company} \n")
}