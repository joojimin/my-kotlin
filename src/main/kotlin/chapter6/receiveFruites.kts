open class Fruit
class Banana: Fruit()
class Orange: Fruit()

fun receiveFruits(fruites: Array<Fruit>) {
    println("Number of fruits: ${fruites.size}")
}

fun receiveFruits2(fruites: List<Fruit>) {
    println("Number of fruits: ${fruites.size}")
}

//val bananas: Array<Banana> = arrayOf();
//receiveFruits(bananas) // type mismatch

var bananas: List<Banana> = listOf();
receiveFruits2(bananas) // 0 ( Success )