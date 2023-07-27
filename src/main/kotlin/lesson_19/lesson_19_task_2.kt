package lesson_19

fun main(){

    val product1 = Product("Свитшот", 1,100)
    val product2 = Product("Ручка", 2,101)
    val product3 = Product("Кошелек", 3,102)

    println(product1.printProductInformation())
    println(product2.printProductInformation())
    println(product3.printProductInformation())

}

enum class Category(val number: Int) {
    CLOTHES(100),
    STATIONERY(101),
    MISCELLANEOUS(102);
}

fun setCategory(category: Category){
    when(category){
        Category.CLOTHES -> println("ОДЕЖДА")
        Category.STATIONERY -> println("КАНЦТОВАРЫ")
        Category.MISCELLANEOUS -> println("РАЗНОЕ")
    }
}

class Product(
    val name: String,
    val id: Int,
    val category: Int
){

    fun printProductInformation(){
        println("Наименование товар: $name. \nID товара: $id, \nКатегория товара: ")
        when(category) {
            Category.CLOTHES.number -> setCategory(Category.CLOTHES)
            Category.STATIONERY.number -> setCategory(Category.STATIONERY)
            Category.MISCELLANEOUS.number -> setCategory(Category.MISCELLANEOUS)
        }
        println()
    }
}