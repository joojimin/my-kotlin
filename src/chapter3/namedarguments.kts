fun createPerson(name: String, height: Int, weight: Int, age: Int = 1) {
    println("$name $age $height $weight")
}

createPerson("jimin.joo", 173, 70, 31) // original
createPerson(name = "jimin.joo", height = 173, weight = 70, age = 31) // named
