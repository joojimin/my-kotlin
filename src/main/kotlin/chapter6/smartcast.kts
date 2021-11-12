class Animal(val age: Int) {
    override operator fun equals(other: Any?): Boolean {
        return if (other is Animal) age == other.age else false
    }
}


class Animal2(val age: Int) {
    override operator fun equals(other: Any?) = other is Animal2 && age == other.age
}


val odie = Animal2(2)
val toto = Animal2(2)
val butch = Animal2(3)
println(odie == toto) // true
println(odie == butch) // false