package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

        new Deck(playersDeck).ShuffleDeck();

        List<Card> drawnCards = new ArrayList<>();

        drawnCards.add(Deck.PullRandom(playersDeck));
        drawnCards.add(Deck.PullRandom(playersDeck));

        int playerScore = drawnCards.get(0).cardRank.value + drawnCards.get(1).cardRank.value;

        System.out.println("Your cards are: " + drawnCards.get(0).cardRank + " of " + drawnCards.get(0).cardSuit + " and " + drawnCards.get(1).cardRank + " of " + drawnCards.get(1).cardSuit + " which is worth " + playerScore + " points.");

        String response = "y";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to draw another card? (y/n)");
        response = scanner.nextLine();

        while (response.contains("y")) {
            drawnCards.add(Deck.PullRandom(playersDeck));
            playerScore += drawnCards.get(drawnCards.size() - 1).cardRank.value;
            System.out.println("Your card is: " + drawnCards.get(drawnCards.size() - 1).cardRank + " of " + drawnCards.get(0).cardSuit + ". Your score is now " + playerScore + " points.");


            System.out.println("Would you like to draw another card? (y/n)");
            response = scanner.nextLine();

        }

        int opponentsScore = opponentsScore();

        if (playerScore > 21 || playerScore < opponentsScore) {
            System.out.println("You lose! Your opponent has " + opponentsScore + " points.");
        }else if (playerScore == opponentsScore){
            System.out.println("It is a draw. Your opponent has the same number of points: " + opponentsScore);
        }else {
            System.out.println("You win! Your opponent has " + opponentsScore + " points.");
        }

    }

    public static int opponentsScore (){
        int min = 15;
        int max = 21;
        return (int)Math.floor(Math.random()*(max-min+1)+min);
    }

}
