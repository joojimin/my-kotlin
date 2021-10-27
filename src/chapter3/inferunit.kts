//fun sayHello() = println("Well, hello")
//val message: String = sayHello() // ERROR, Return Type이 Unit

//error: type mismatch: inferred type is Unit but String was expected (inferunit.kts:2:23)
//inferunit.kts:2:23: error: type mismatch: inferred type is Unit but String was expected
//val message: String = sayHello() // ERROR, Return Type이 Unit


fun sayHello(): Unit = println("Well, hello")
val message: Unit = sayHello();
println("The result of sayHello is $message")