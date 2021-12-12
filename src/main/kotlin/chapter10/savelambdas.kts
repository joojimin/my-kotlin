val names = listOf("Pam", "Pat", "Paul", "Paula")

val checkLength5 = { name: String -> name.length == 5 } // (String) -> Boolean 타입추론
val checkLength6: (String) -> Boolean = { name -> name.length == 5 }
val checkLength7 = fun(name: String): Boolean { return name.length == 5 } // 익명함수