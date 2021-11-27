interface Worker {
    fun work()
    fun takeVacation()
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


class Manager(private val worker: Worker) {
    fun work() = worker.work()
    fun takeVacation() = worker.takeVacation()
}


val javaProgrammer = JavaProgrammer()
val manager = Manager(javaProgrammer)
manager.work() // ...write Java...
manager.takeVacation() // ...code at the beach...