package lesson_14

fun main() {
    val message = MessageInForum("Привет! Как дела?", "Роман")
    val comment = Comment(message.text, "Ольга", "Спасибо, хорошо!")

    message.sendMessage()
    comment.sendComment()
}

open class MessageInForum(
    val text: String,
    val author: String,
) {
    fun sendMessage() {
        println("Автор \"$author\" отправил следующее сообщение: \"$text\"")
    }
}

class Comment(
    text: String,
    author: String,
    val comment: String,
) : MessageInForum(text, author) {
    fun sendComment() {
        println("Автор \"$author\" оставил комментарий над сообщением \"$text\": \"$comment\"")
    }
}