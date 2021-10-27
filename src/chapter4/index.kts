var names = listOf("Tom", "jerry", "Spike")
for (index in names.indices) {
    println("Position of ${names.get(index)} is $index")
}

//Position of Tom is 0
//Position of jerry is 1
//Position of Spike is 2


for ((index, name) in names.withIndex()) {
    println("Position of $name is $index")
}