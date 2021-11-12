object util {
    fun numberOfProcessors() = Runtime.getRuntime().availableProcessors()
}

println(util.numberOfProcessors())