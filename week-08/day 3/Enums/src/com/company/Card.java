package com.company;

public class Card {
    /*The Card class has 3 enum properties:
    One for the color(red, black)
    One for the suit(clubs, diamonds, hearts, spades)
    One for the rank(2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K, A)*/

    public enum color {red, black}
    public enum suit {clubs, diamonds, hearts, spades}
    public enum rank {
        two(2), three(3), four(4), five(5), six(6), seven(7), eight(8), nine(9), ten(10), J(1), Q(1), K(1), A(11);
        private final int value;

        private rank(int value) {
            this.value = value;
        }
    }

}
