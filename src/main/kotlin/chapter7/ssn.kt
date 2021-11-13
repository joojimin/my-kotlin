package chapter7

@JvmInline
value class SSN(val id: String)

fun receiveSSN(ssn: SSN) {
    println("Received $ssn")
}

