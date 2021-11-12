fun whatToDo(dayOfWeek: Any) {
    when (dayOfWeek) {
        "Saturday", "Sunday" -> println("Relax")
        in listOf("Monday", "TuesDay", "Wednesday", "Thursday") -> println("Work hard")
        in 2..4 -> println("Work hard")
        "Fridy" -> println("Party")
        is String -> println("What?")
        else -> println("No clue")
    }
}

whatToDo("Sunday")
whatToDo("Wednesday")
whatToDo(3)
