import java.lang.RuntimeException

fun compateSqrt(n: String): Double {
    if (n >= 0) {
        return Math.sqrt(n);
    } else {
        throw RuntimeException("No negative please")
    }
}