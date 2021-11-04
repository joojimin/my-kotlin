
// not checked null
fun example(name: String?): String? {
    if (null != name) {
        return name.reversed()
    }
    return null
}

// safe call operator
fun example2(name: String?): String? {
    return name?.reversed()?.uppercase()
}


println(example(null)) // null
println(example2(null)) // null