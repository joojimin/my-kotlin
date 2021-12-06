interface Worker {
    fun work()
    fun takeVacation()
    fun fileTimeSheet()  = println("Why? Really?")
}

class JavaProgrammer : Worker {
    override fun work() = println("...write java...")
    override fun takeVacation() = println("...code at the beach...")
}

class CSharpProgrammer : Worker {
    override fun work() = println("...write C#...")
    override fun takeVacation() = println("...branch at the ranch...")
}

class Manager(var staff: Worker) : Worker by staff
val doe = Manager(JavaProgrammer())
println("Staff is ${doe.staff.javaClass.simpleName}") // Staff is JavaProgrammer
doe.work() // ...write java...
println("changing staff") // changing staff
doe.staff = CSharpProgrammer() // Staff is CSharpProgrammer
println("Staff is ${doe.staff.javaClass.simpleName}") // ...write java...
doe.work()