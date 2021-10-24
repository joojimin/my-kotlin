fun canVote(name: String, age: Int): String {
    var status: String
    if ( age > 17 ) {
        status = "yes, please vote"
    } else {
        status = "nope, please come back"
    }
    return "$name, $status"
}
println(canVote("Eve", 12))

fun canVoteWithExpressionStyle(name: String, age:Int): String {
    val status = if (age > 17) "yes, please vote" else "nope, please come back"
    return "$name, $status"
}
println(canVoteWithExpressionStyle("Eve", 12))