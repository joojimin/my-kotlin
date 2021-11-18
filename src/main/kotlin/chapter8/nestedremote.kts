interface Remote {
    fun up()
    fun down()
    fun doubleUp() {
        up()
        up()
    }

    companion object {
        fun combine(first: Remote, second: Remote): Remote = object : Remote {
            override fun up() {
                first.up()
                second.up()
            }

            override fun down() {
                first.down()
                second.down()
            }
        }
    }
}


class TV {
    private var volumn = 0
    val remote: Remote
        get() = TVRemote()

    override fun toString() = "Volumn: ${volumn}"

    inner class TVRemote : Remote {
        override fun up() {
            volumn++
        }
        override fun down() {
            volumn--
        }
        override fun toString() = "Remote: ${this@TV}"
    }
}

val tv = TV()
val remote = tv.remote
println("$tv") // Volumn: 0
remote.up()
println("After increasing: $tv") // After increasing: Volumn: 1
remote.doubleUp()
println("After doubleUp: $tv") // After doubleUp: Volumn: 3