package lesson_17

class Quiz{

    var question = "Как называется спутник Земли?"
        set(value: String) {
            field = value
        }

    var answer = "Луна"
        get() = field
        set(value: String) {
            field = value
        }

}