package lesson_18

fun main() {
    val order1 = Order()
    val order2 = Order()

    order1.orderData(1, "Шоколад \"Alpen Gold\"")
    order2.orderData(2, listOf("Зубная паста SPLAT", "моющее средство FAIRY", "мыло Dove"))
}


class Order {

    fun orderData(
        id: Int,
        goods: String,
    ) {
        println("Заказан товар: $goods")
    }

    fun orderData(
        id: Int,
        goods: List<String>,
    ) {
        println("Заказаны следующие товары: $goods")
    }

}