fun invokeWith(n: Int, action: (Int) -> Unit) {
    println("enter invokeWith $n")
    action(n)
    println("exit invokeWith $n")
}


fun caller() {
    (1..3).forEach { i ->
        invokeWith(i) here@ {
            println("enter for $it")
            if (it == 2) {
                return@here
            }
            println("exit for $it")
        }
    }
    println("end of caller")
}

caller()
println("after return from caller")

//enter invokeWith 1
//enter for 1
//exit for 1
//exit invokeWith 1
//enter invokeWith 2
//enter for 2
//exit invokeWith 2
//enter invokeWith 3
//enter for 3
//exit for 3
//exit invokeWith 3
//end of caller
//after return from caller