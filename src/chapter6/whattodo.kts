fun whatToDo(dayOfWeek: Any) = when (dayOfWeek) {
    "Saturday", "Sunday" -> "Relax"
    in listOf("Monday", "Tuesday", "Wednesday", "Thursday") -> "Work hard"
    in 2..4 -> "Work hard"
    "Friday" -> "Party"
    is String -> "What?"
    else -> "No clue"
}

println(whatToDo("Saturday")) // Relax
println(whatToDo("Monday")) // Work hard
println(whatToDo(2)) // Work hard
println(whatToDo("Friday")) // Party
println(whatToDo("hihihihi")) // What?