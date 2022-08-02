object Wallservice {
    var posts = emptyArray<Post>()

    fun add(post: Post): Post{
        posts+= post
        return posts.last()
    }

    fun printLastPost(){
       println(posts.last().toString())
    }

    fun printPosts(){
        for (i in posts.indices){
            println(posts[i])
        }
    }
}