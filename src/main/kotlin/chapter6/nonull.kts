fun nickName(name: String?): String? {
    if (name == "William") {
        return "Bill"
    }
    return null
}

println("Nickname for William is ${nickName("William")}")
println("Nickname for Venkat is ${nickName("Venkat")}")
println("Nickname for null is ${nickName(null)}")


//error: null can not be a value of a non-null type String (nonull.kts:5:12)
//error: null can not be a value of a non-null type String (nonull.kts:10:42)
//nonull.kts:5:12: error: null can not be a value of a non-null type String
//return null
//^
//nonull.kts:10:42: error: null can not be a value of a non-null type String
//println("Nickname for null is ${nickName(null)}")
//^