interface Worker {
    fun work()
    fun takeVacation()
    fun fileTimeSheet() = println("Why? Really?")
}

class JavaProgrammer : Worker {
    override fun work() {
        println("...write Java...")
    }

    override fun takeVacation() {
        println("...code at the beach...")
    }
}


class CSharpProgrammer : Worker {
    override fun work() {
        println("...write C#...")
    }

    override fun takeVacation() {
        println("...branch at the ranch...")
    }
}

interface Assistant {
    fun doChores()
    fun fileTimeSheet() = println("No escape from that")
}

class DepartmentAssistant : Assistant {
    override fun doChores() = println("routine stuff")
}


class Manager(private val staff: Worker, private val assistant: Assistant) :
    Worker by staff, Assistant by assistant {

    override fun takeVacation() = println("of course")
    override fun fileTimeSheet() {
        print("manually forwarding this...")
        assistant.fileTimeSheet()
    }
}

val doe = Manager(CSharpProgrammer(), DepartmentAssistant())
doe.work() // ...write C#...
doe.takeVacation() // of course
doe.doChores() // routine stuff
doe.fileTimeSheet() // manually forwarding this...No escape from that