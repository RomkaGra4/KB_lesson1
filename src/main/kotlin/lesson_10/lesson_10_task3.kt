package lesson_10

fun main(){

    println("Задайте длину пароля:")
    val passwordLength = readln().toInt()

    println(passwordGeneration(passwordLength))
}

fun passwordGeneration(passwordLength: Int): String {
    val passRangeWithSymbols = ('"'..'/') + (':'..'@') + ('['..'`') + ('~')
    val passRangeWithNumbers = ('0'..'9')
    val password = mutableListOf<String>()
    for (i in 0 until passwordLength) {
        if (i % 2 == 0) {
            password.add(i, passRangeWithSymbols.random().toString())
        } else {
            password.add(i, passRangeWithNumbers.random().toString())
        }
    }
    var result = ""
    for (i in password) {
        result = result.plus(i)
    }

    return result
}


