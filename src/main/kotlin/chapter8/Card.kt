package chapter8

import java.lang.RuntimeException

sealed class Card(val suit: String) {
    class Ace(suit: String) : Card(suit)
    class King(suit: String) : Card(suit) {
        override fun toString() = "King of $suit"
    }

    class Queen(suit: String) : Card(suit) {
        override fun toString() = "Queen of $suit"
    }

    class Jack(suit: String) : Card(suit) {
        override fun toString() = "Jack of $suit"
    }

    class Pip(suit: String, val number: Int) : Card(suit) {
        init {
            if (number < 2 || number > 10) {
                throw RuntimeException("Pip has to be betwwen 2 and 10")
            }
        }
    }
}