package lesson_22

fun main() {

    val viewModel = ViewModel()
    println(viewModel.state)
    viewModel.loadData()

}

class ViewModel {

    var state: MainScreenState = MainScreenState("Data from server...")

    fun loadData() {
        state = state.copy(isLoading = true)
        println(state)
        var loadedData = "... отсутствие данных"
        state = state.copy(data = loadedData)
        println(state)
        loadedData = "...загрузка данных"
        state = state.copy(data = loadedData)
        println(state)
        loadedData = "....наличие загруженных данных"
        state = state.copy(data = loadedData)
        println(state)
    }

}

data class MainScreenState(
    val data: String,
    val isLoading: Boolean = false,
)