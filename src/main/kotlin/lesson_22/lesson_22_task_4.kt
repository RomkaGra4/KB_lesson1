package lesson_22

fun main() {

    val object1 = ViewModel(MainScreenState("Первичные данные ..."))
    val object2 = ViewModel(object1.mainScreenState.copy(isLoading = true))
    object2.loadData()

}

class ViewModel(val mainScreenState: MainScreenState) {


    fun loadData() {
        println(MainScreenState("...отсутствие данных"))
        println(MainScreenState("...загрузка данных"))
        println(MainScreenState("...наличие загруженных данных"))
    }

}

data class MainScreenState(
    val data: String,
    val isLoading: Boolean = false,
)