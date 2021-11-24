package com.company;

import static com.company.Card.color.black;
import static com.company.Card.color.red;

public class Card {
    /*The Card class has 3 enum properties:
    One for the color(red, black)
    One for the suit(clubs, diamonds, hearts, spades)
    One for the rank(2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K, A)*/

    public enum color {red, black}

    public enum suit {

        clubs("clubs"), diamonds("diamonds"), hearts("hearts"), spades("spades");

        private final String value;

        private suit (String value) {
            this.value = value;
        }

    }

    public enum rank {

        ace(1), two (2), three (3), four(4), five(5), six(6), seven(7), eight(8), nine(9), ten(10), jack(10), queen(10), king(10);

        private final int value;

        private rank(int value) {
            this.value = value;
        }
    }

    color cardColor;
    suit cardSuit;
    rank cardRank;

    public Card (suit cardSuit, rank cardRank){
        this.cardSuit = cardSuit;
        this.cardRank = cardRank;

        if (cardSuit.value == "clubs" || cardSuit.value == "spades"){
            cardColor = black;
        } else {
            cardColor = red;
        }
    }

}
