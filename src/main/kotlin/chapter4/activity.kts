fun whatToDo(dayOfWeek: Any) = when (dayOfWeek) {
    "Saturday", "Sunday" -> "Relax"
    in listOf("Monday", "TuesDay", "Wednesday", "Thursday") -> "Work hard"
    in 2..4 -> "Work hard"
    "Fridy" -> "Party"
    is String -> "What?"
    else -> "No clue"
}

println(whatToDo("Sunday")) // Relax
println(whatToDo("Wednesday")) // Work hard
