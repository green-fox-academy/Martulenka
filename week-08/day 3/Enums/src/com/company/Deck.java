package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    /*The Deck class holds the instances of the Card classes
    Create methods for the class
    ShuffleDeck, PullFirst, PullLast, PullRandom*/

    List<Card> cardDeck = new ArrayList<>();

    public Deck(List<Card> cardDeck){
        this.cardDeck = cardDeck;

        for (int j = 0; j < 4; j++) {
            for (int k = 0; k < 13; k++) {
                this.cardDeck.add(new Card(Card.suit.values()[j], Card.rank.values()[k]));
            }
        }
    }

    public void  ShuffleDeck(){

        Collections.shuffle(this.cardDeck);
    }

    public Card PullFirst(){
        return this.cardDeck.get(0);
    }

    public Card PullLast(){
        return this.cardDeck.get(cardDeck.size()-1);
    }

    public Card PullRandom(){
        return this.cardDeck.get((int)Math.floor(Math.random()*(cardDeck.size()-1)+1));
    }

}
