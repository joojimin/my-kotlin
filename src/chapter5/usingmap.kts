val sites = mapOf(
    "pragprog" to "https://www.pragprog.com",
    "agiledeveloper" to "https://agiledeveloper.com"
)

println(sites) // {pragprog=https://www.pragprog.com, agiledeveloper=https://agiledeveloper.com}
println(sites.size) // 2
println(sites::class) // class java.util.LinkedHashMap
println(sites.javaClass) // class java.util.LinkedHashMap


val pragProgSite: String? = sites.get("pragprog")
val pragProgSite2: String? = sites["pragprog"]
println(pragProgSite)
println(pragProgSite2)

val agiledeveloper = sites.getOrDefault("agiledeveloper", "http://www.example.com")
println(agiledeveloper)
println(agiledeveloper::class) // class kotlin.String
println(agiledeveloper.javaClass) // class java.lang.String