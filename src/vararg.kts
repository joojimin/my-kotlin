fun max(vararg numbers: Int): Int {
    var large = Int.MIN_VALUE
    for (number in numbers) {
        large = if (number > large) number else large
    }
    return large
}

//println(max(1,4,3,6,2))

val values = intArrayOf(1, 2, 3, 4, 5)
println(max(*values))