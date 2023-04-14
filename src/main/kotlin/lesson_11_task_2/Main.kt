package lesson_11_task_2

fun main(){
    val user = UserData(
        id = 1,
        login = "Роман",
        password = "roro515",
        email = "roman945@mail.ru"
    )

    user.printUserInformation()
    user.getInformationAndSaveInBio()
    user.changePassword()
    user.getTextForSend()
}