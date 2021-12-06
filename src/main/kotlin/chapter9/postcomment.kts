import kotlin.reflect.KProperty

class PoliteString(val dataSource: MutableMap<String, Any>) {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String =
        (dataSource[property.name] as? String)?.replace("stupid", "s*****") ?: ""

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        dataSource[property.name] = value
    }
}


class PostComment(dataSource: MutableMap<String, Any>) {
    val title: String by dataSource
    var likes: Int by dataSource
    val comment: String by PoliteString(dataSource)
    override fun toString(): String = "Title: $title Likes: $likes Comment: $comment"
}


val data = listOf(
    mutableMapOf(
        "title" to "Using Delegation",
        "likes" to 2,
        "comment" to "Keep it simple, stupid"),
    mutableMapOf(
        "title" to "Using Inheritance",
        "likes" to 1,
        "comment" to "Prefer Delegation where possible"
    )
)

val forPost1 = PostComment(data[0] as MutableMap<String, Any>)
val forPost2 = PostComment(data[1] as MutableMap<String, Any>)
forPost1.likes++
println(forPost1) // Title: Using Delegation Likes: 3 Comment: Keep it simple, s*****
println(forPost2) // Title: Using Inheritance Likes: 1 Comment: Prefer Delegation where possible

