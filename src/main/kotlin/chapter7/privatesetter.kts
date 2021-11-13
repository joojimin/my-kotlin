class myClass(param: Int) {
    var fuelLevel = param
    private set(value) {
        field = value
    }
}

val testObject = myClass(1000)
println(testObject.fuelLevel)
//testObject.fuelLevel = 3000 // Cannot assign to 'fuelLevel': the setter is private in 'myClass'