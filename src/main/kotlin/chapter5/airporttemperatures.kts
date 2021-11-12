val airportCodes = listOf("LAX", "SFO", "PDX", "SEA")
val temperatures = airportCodes.map { code -> code to mappingValue(code) }
println(temperatures)

fun mappingValue(code: String): String {
    return "$code hi"
}