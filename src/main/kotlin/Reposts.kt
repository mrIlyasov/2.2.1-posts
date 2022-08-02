class Reposts(
    var userReposted: Boolean,
    count: Int = 0
) {
    var count = count
        set(value) {
            if (value < 0) {
                field = 0
            } else field = value
        }

    init {
        if (count < 0)
            this.count = 0
    }


    override fun toString(): String {
        return count.toString()
    }
}