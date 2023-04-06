package lesson_7

fun main(){

    println("Программа выводит все чётные числа от нуля до числа, введенного Вами. Введите число: ")
    val userNumber = readln().toInt()

    for (i in 0 .. userNumber step 2)
        println(i)
}