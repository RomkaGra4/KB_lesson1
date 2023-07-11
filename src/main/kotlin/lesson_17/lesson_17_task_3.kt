package lesson_17

fun main() {
    val folder1 = Folders()
    println(folder1.name)
    println(folder1.files)
    folder1.isSecret = false
    println(folder1.name)
    println(folder1.files)

}

class Folders {
    val name: String = "Music"
        get() = if (isSecret) "Скрытая папка" else field
    val files: Int = 224
        get() = if (isSecret) 0 else field
    var isSecret: Boolean = true

}
