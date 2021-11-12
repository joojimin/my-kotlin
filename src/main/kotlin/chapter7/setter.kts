import java.lang.RuntimeException

class Car(val yearOfMake: Int, theColor: String) {
    var fuelLevel = 100
    var color = theColor
    set(value) {
        if (value.isBlank()) {
            throw RuntimeException("no empty, please")
        }
        field = value
    }
    get() = field + "hi"
}

val car = Car(2021, "Green")
println(car.color)
println(car.fuelLevel)
