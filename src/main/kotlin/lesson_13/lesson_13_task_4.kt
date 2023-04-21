package lesson_13

fun main() {

    val contact1 = TelephoneBook(name = "Роман", company = "FM Logistic")
    val contact2 = TelephoneBook(name = "Ольга", number = "89605537705")
    val contact3 = TelephoneBook(number = "89165520202", company = "Pepsi Co")

    val contactsList = mutableListOf(contact1, contact2, contact3)
    addNewContactList(contactsList)
    printInformation(contactsList)

}

class TelephoneBook(
    val name: String? = null,
    val number: String? = null,
    val company: String? = null,
)

fun addNewContactList(contactsList: MutableList<TelephoneBook>) {
    do {println("Добавить новую запись в телефонную книгу:")

        println("Веди имя контакта:")
        val name = if (readln().isEmpty()) null else TODO()
        println("Веди номер контакта:")
        val number = readln()
        println("Веди организацию контакта:")
        val company = if (readln().isEmpty()) null else TODO()

        contactsList.add(TelephoneBook(name = name, number = number, company = company))

        println("Если хотите добавить новую запись, введите “да” ")
        val result = readLine()
    } while (result == "да")

}

fun printInformation(contactsList: List<TelephoneBook>) {

    for (element in contactsList)
        println("Имя: ${element.name} \nНомер: ${element.number} \nКомпания: ${element.company} \n")
}