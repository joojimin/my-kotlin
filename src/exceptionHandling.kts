println("start")

fun test1() {
    println("start test1")
    throw Exception("Exception")
}

fun test2() {
    println("start test2")
    test1()
}

println("start main")

try {
    test2()
} catch (ex:Exception) {
    println(ex.stackTrace[0])
}
println("end main")