//fun <T> useAndClose(input: T) {
//    input.close() // unresolved reference: close
//}


fun <T: AutoCloseable> useAndClose(input: T) {
    input.close() // no problem
}