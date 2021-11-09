open class Fruit
class Banana : Fruit()
class Orange : Fruit()


fun copyFromTo(from: Array<out Fruit>, to: Array<in Fruit>) {
    for (i in 0 until from.size) {
        to[i] = from[i]
    }
}

val bananaBasket = Array<Banana>(3) { _ -> Banana() }
val things = Array<Any>(3) { _ -> Fruit() }
copyFromTo(bananaBasket, things)