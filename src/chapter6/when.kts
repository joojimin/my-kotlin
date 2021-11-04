
// 세이프 콜 + 엘비스 조합
fun nickName(name: String?): String {
    if (name == "William") {
        return "Bill"
    }
    return name?.reversed()?.uppercase() ?: "Joker"
}


// when
fun nickName2(name: String?) = when (name) {
    "William" -> "Bill"
    null -> "Joker"
    else -> name.reversed().uppercase()
}


println(nickName(null))
println(nickName2(null))