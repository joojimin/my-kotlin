package chapter8

import chapter8.Card.Ace
import chapter8.Card.King
import chapter8.Card.Queen
import chapter8.Card.Jack
import chapter8.Card.Pip

fun process(card: Card) = when (card) {
    is Ace -> "${card.javaClass.name} of ${card.suit}"
    is King, is Queen, is Jack -> "$card"
    is Pip -> "${card.number} of ${card.suit}"
}

fun main() {
    println(process(Ace("Diamond"))) // chapter8.Card$Ace of Diamond
    println(process(Queen("Clubs"))) // Queen of Clubs
    println(process(Pip("Spades", 2))) // 2 of Spades
    println(process(Pip("Hearts", 6))) // 6 of Hearts
}