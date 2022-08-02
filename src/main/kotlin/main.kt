



fun main() {
    var reposts = Reposts(false, 0)
    var views = Views(0)
    var likes = Likes(0)
    var reposts1 = Reposts(false, 0)
    var views1 = Views(2)
    var likes1 = Likes(2)
    var post = Post(0, 1, 1, "Hello World!", likes, views, reposts, false, false)
    var post1 = Post(1, 2, 2, "Hello Kotlin!", likes1, views1, reposts1, false, false)
    var wallservice = Wallservice;
    wallservice.add(post)
    wallservice.add(post1)
    wallservice.printPosts()

}
