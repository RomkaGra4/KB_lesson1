package lesson_16

fun main() {

    val order1 = Order(1, false)
    order1.sendingAnApplication(true)

}

class Order(
    private val id: Int,
    var readiness: Boolean,
) {
    fun getId() = id
    fun sendingAnApplication(boolean: Boolean) {
        println("Отправляем заявку менеджеру на изменение статуса заказа")
        changeOrderStatus(boolean)
    }

    private fun changeOrderStatus(readiness: Boolean) = println("Статус заказа изменен на $readiness")
}