var factor = 2
val doubled = listOf(1, 2).map { it * factor }
val doubledAlso = sequenceOf(1, 2).map { it * factor }
factor = 0
doubled.forEach { println(it) } // 2, 4
doubledAlso.forEach { println(it) } // 0, 0