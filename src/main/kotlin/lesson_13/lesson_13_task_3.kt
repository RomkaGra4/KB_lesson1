package lesson_13

fun main() {

    val contact1 = TelephoneBook(name = "Роман", number = null, company = "FM Logistic")
    val contact2 = TelephoneBook(name = "Ольга", number = "89605537705", company = null)
    val contact3 = TelephoneBook(number = "89165520202", company = "Pepsi Co")


    val contactsList = listOf(contact1, contact2, contact3)
    printInformation(contactsList)

}

class TelephoneBook(
    var name: String? = null,
    var number: String? = null,
    var company: String? = null,
)

fun printInformation(contactsList: List<TelephoneBook>) {

    for (i in contactsList) {
        if (i.name == null) i.name = "[не указано]"
        if (i.number == null) i.number = "[не указано]"
        if (i.company == null) i.company = "[не указано]"
    }

    for (element in contactsList)
        println("Имя: ${element.name} \nНомер: ${element.number} \nКомпания: ${element.company} \n")
}