val friends = arrayOf("Tintin", "Snowy", "Haddock", "Calculus")
println(friends::class) // class kotlin.Array
println(friends.javaClass) // class [Ljava.lang.String;
println("${friends[0]} and ${friends[1]}") // Tintin and Snowy