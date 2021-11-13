import java.lang.RuntimeException

class Car(val yearOfMonth: Int, theColor: String) {
    var fuelLevel = if(yearOfMonth < 2020) 90 else 100
    private set

    var color = theColor
    set(value) {
        if(value.isBlank()) {
            throw RuntimeException("no empty, please")
        }
        field = value
    }
}

