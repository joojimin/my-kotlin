class MachineOperator(val name: String) {
    fun checkIn() = checkedIn++
    fun checkOut() = checkedIn--

    companion object {
        var checkedIn = 0
        fun minimumBreak() = "15 minutes every 2 hours"
    }
}

MachineOperator("Mater").checkIn()
println(MachineOperator.minimumBreak()) // 15 minutes every 2 hours
println(MachineOperator.checkedIn) // 1