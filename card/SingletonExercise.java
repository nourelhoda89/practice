package card;

import card.Suit;
import card.Deck;
import card.Card;

public class SingletonExercise {
  public static void main(String args[]) {
   
    //to use the Deck singlton class
    Deck deck = Deck.getInstance();
    deck.print( );
  }
}

