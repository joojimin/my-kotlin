fun createRunnalble(): java.lang.Runnable {
    val runnable = object : java.lang.Runnable {
        override fun run() {
            println("You called...")
        }
    }
    return runnable
}

val aRunnable = createRunnalble()
aRunnable.run() // You called...


fun createRunnable2(): java.lang.Runnable = java.lang.Runnable { println("You called...") }
val aRunnable2 = createRunnable2()
aRunnable2.run() // You called...


fun createRunnable3(): java.lang.Runnable = object : java.lang.Runnable, java.lang.AutoCloseable {
    override fun run() {
        println("You called...")
    }

    override fun close() {
        println("closing...")
    }
}
val aRunnable3 = createRunnable3()
aRunnable3.run()