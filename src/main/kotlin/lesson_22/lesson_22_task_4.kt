package lesson_22

fun main(){

    val object1 = ViewModel.MainScreenState("Данные...", true)
    val object2 = object1.copy(isLoading = true)
    object2.loadData()

}

class ViewModel(mainScreenState: MainScreenState) {

    data class MainScreenState(
        val data: String,
        val isLoading: Boolean = false,
    ) {
        fun loadData() {
            println(MainScreenState("...отсутствие данных"))
            println(MainScreenState("...загрузка данных"))
            println(MainScreenState("...наличие загруженных данных"))
        }
    }


}