import kotlin.RuntimeException

inline fun invokeTow(
    n: Int,
    action1: (Int) -> Unit,
    action2: (Int) -> Unit
): (Int) -> Unit {
    println("enter invokeTwo $n")
    action1(n)
    action2(n)
    println("exit invokeTwo $n")
    return { _: Int -> println("lambda returned from invokeTwo") }
}

fun report(n: Int) {
    println("")
    print("called with $n, ")
    val stackTrace = RuntimeException().stackTrace
    println("Stack depth: ${stackTrace.size}")
    println("Partial listing of the stack:")
    stackTrace.take(3).forEach(::println)
}


fun callInvokeTwo() {
    invokeTow(1, { i -> report(i) }, { i -> report(i) })
}
callInvokeTwo()

//enter invokeTwo 1
//
//called with 1, Stack depth: 28
//Partial listing of the stack:
//Noinline.report(noinline.kts:18)
//Noinline.callInvokeTwo(noinline.kts:26)
//Noinline.<init>(noinline.kts:28)
//
//called with 1, Stack depth: 28
//Partial listing of the stack:
//Noinline.report(noinline.kts:18)
//Noinline.callInvokeTwo(noinline.kts:26)
//Noinline.<init>(noinline.kts:28)
//exit invokeTwo 1