package com.company;

import java.util.ArrayList;
import java.util.List;

public class Game {
        /*Create the beloved Twenty Plus One game!
        Create a Card, a Deck, and a Game class

        The Card class has 3 enum properties:
        One for the color(red, black)
        One for the suit(clubs, diamonds, hearts, spades)
        One for the rank(2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K, A)

        The Deck class holds the instances of the Card classes
        Create methods for the class
        ShuffleDeck, PullFirst, PullLast, PullRandom

        The Game class is responsible to the game itself
        It should have a method that generates a random number between 15 and 21, which will be the opponents score
        It should ask the player to continue or to stop drawing cards
        The game is lost, if the sum of the pulled cards are above 21 or below the random number*/

    public static void main(String[] args) {

        List<Card> playersDeck = new ArrayList<>();

        new Deck(playersDeck);



    }

    public static int opponentsScore (){
        int min = 15;
        int max = 21;
        return (int)Math.floor(Math.random()*(max-min+1)+min);
    }

}
