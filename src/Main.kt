import model.Channel
import model.User
import model.Video
import java.util.*

fun main(){

    val user = User("1aaf","David C","davidcab11@gmail.com")

    val user1 = User("1aaf","David C","davidcab11@gmail.com")

    val video = Video("1bcd","Learning Observer Pattern Kotlin",
        "https://www.youtube.com/watch?v=LQ5C6MqykZs", Date())

    val channel = Channel("1acr4","Learn Kotlin Channel", video)


    channel.subscribe(user)
    channel.subscribe(user1)
    channel.uploadVideo(video)

    channel.unsubscribe(user)
    channel.uploadVideo(video)










}