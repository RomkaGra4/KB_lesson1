package lesson_17

fun main(){
    val player1 = Player("Roman", "qwerty123")
    player1.password = "asdfg123"
    println(player1.password)
    player1.login = "Roman1993"
    println(player1.login)

}

class Player(_login: String, _password: String) {
    var login = _login
        set(value) {
            println("Ваш логин успешно изменен")
            field = value
        }
    var password = _password
        set(value) {
            println("Вы не можете изменить пароль")
            repeat(password.length) {
                print("*")
            }
            println()
        }
}
