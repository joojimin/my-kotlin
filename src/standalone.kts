import java.lang.Exception
import java.lang.RuntimeException

fun nofluff() {
    println("nofluff called...")
    throw RuntimeException("oops")
}
println("not in a function, calling nofluff()")
try {
    nofluff()
} catch (ex:Exception) {
    val stackTrace = ex.stackTrace
    println(stackTrace[0])
    println(stackTrace[1])
}