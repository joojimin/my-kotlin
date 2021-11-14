class PriorityPair<T: Comparable<T>>(member1: T, member2: T) {
    val first: T
    val second: T
    init {
        if (member1 >= member2) {
            first = member1
            second = member2
        } else {
            first = member2
            second = member1
        }
    }

    override fun toString(): String {
        return "$first, $second"
    }
}

println(PriorityPair(2, 1)) // 2, 1
println(PriorityPair("A", "B")) // B, A