class MachineOperator private constructor(val name: String) {
    var num = 0
    fun checkIn() = num++
    fun checkOut() = num--

    companion object {
        fun create(name: String): MachineOperator {
            val instance = MachineOperator(name)
            instance.checkIn()
            return instance
        }
    }
}

val operator = MachineOperator.create("hi")
println(operator.num) // 1
operator.checkIn()
println(operator.num) // 2