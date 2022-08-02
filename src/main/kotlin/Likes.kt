class Likes(
    count: Int,
    var userLikes: Boolean = false,
    var canLike: Boolean = true,
    var canPublish: Boolean = true
) {
    var count = count
        set(value) {
            if (value >= 0) {
                field = value
            }
        }

        init {

        if (this.count < 0) {
            this.count = 0
        }
    }

    fun addLike() {
        count = count + 1
    }

    override fun toString(): String {
        return count.toString()
    }


}