data class Task(val id: Int, val name: String, val completed: Boolean, val assigned: Boolean)

val task1 = Task(1, "Create Project", false, true)
println(task1) // Task(id=1, name=Create Project, completed=false, assigned=true)
println("name: ${task1.name}") // name: Create Proejct

val task1Completed = task1.copy(completed = true, assigned = false)
println(task1Completed) // Task(id=1, name=Create Project, completed=true, assigned=false )
println(task1 === task1Completed) // false

val (id, _, _, isAssigned) = task1
println("Id: $id Assigned: $isAssigned") //Id: 1 Assigned: true