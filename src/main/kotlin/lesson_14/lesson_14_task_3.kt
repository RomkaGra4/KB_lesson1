package lesson_14

fun main() {
    val author1 = Comment("Привет! Как дела?", "Роман")
    author1.sendMessage()
    author1.sendComment()
}

open class MessageInForum(
    val text: String,
    val author: String,
) {}

class Comment(
    text: String,
    author: String,
) : MessageInForum(text, author) {

    fun sendMessage() {
        println("Автор \"$author\" отправил следующее сообщение: \"$text\"")
    }

    fun sendComment() {
        println("Автор \"$author\" оставил комментарий над сообщением \"$text\": \"${readln()}\"")
    }
}

