package lesson_16

fun main() {

    val order1 = Order(1)
    order1.sendingAnApplication()

}

class Order(
    private val id: Int,
    var readiness: Boolean = false,
) {
    fun getId() = id
    fun sendingAnApplication() {
        println("Отправляем заявку менеджеру на изменение статуса заказа")
        readiness = true
        println("Статус заказа изменен на $readiness")
    }
}