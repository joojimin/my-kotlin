class Person(val first: String, val last: String) {
    private var fulltime = true
    private var location: String = "-"
    constructor(first: String, last: String, fte: Boolean): this(first, last) {
        println("second constructor")
        fulltime = fte
    }
    constructor(first: String, last: String, loc: String): this(first, last, false) {
        println("third constructor")
        location = loc
    }

    override fun toString(): String {
        return "$first $last $fulltime $location"
    }
}

println(Person("Jane", "Doe")) // Jane Doe true -
println(Person("John", "Doe", false)) // John Doe false -
println(Person("Baby", "Doe", "home")) // Baby Doe false home