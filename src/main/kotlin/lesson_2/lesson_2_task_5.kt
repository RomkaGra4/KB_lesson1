package lesson_2

import kotlin.math.pow

fun main (){

        val money = 70_000
        val interestRate = 16.7
        val time = 20

        val result = (money * ((1 + 16.7 / 100)).pow(20))
        println(String.format("%.3f", result))

    }


/*

S = V * (1 + P / 100) n, где:

V – сумма вклада,
P – годовая процентная ставка по тарифу,
n – срок в годах,
S – общая сумма на конец графика.

*/