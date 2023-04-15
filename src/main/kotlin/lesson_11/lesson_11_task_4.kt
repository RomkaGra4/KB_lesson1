package lesson_11

fun main(){
    val contact = Contact(
        number = TelephoneNumber(mobilePhone = 89995150033, cityPhone = 84953991010),
        emailAdress = ICloud("mail@mail.ru"),
        myPeople = FavoriteContacts(wife = "Username", friend1 = "Username", friend2 = "Username")
    )
}

class Contact(
    val number: TelephoneNumber,
    val emailAdress: ICloud,
    val myPeople: FavoriteContacts,
){}

class TelephoneNumber(
    val mobilePhone: Long,
    val cityPhone: Long,
){}

class ICloud(
    val email: String,
){}

class FavoriteContacts(
    val wife: String,
    val friend1: String,
    val friend2: String,
){}