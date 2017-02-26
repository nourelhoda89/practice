package card;

import java.util.*;
import card.Card;
import card.Suit;

public class Deck {
//create a static instance of the class
private static Deck deck;
//public Card card;

//make the constructor private 
  private Deck( ) {
    cards = new ArrayList<Card>( );

    // build the deck
    Suit[] suits = {Suit.SPADES, Suit.HEARTS, Suit.CLUBS, Suit.DIAMONDS};
    for(Suit suit: suits) {
      for(int i = 2; i <= 14; i++) {
        cards.add(new Card(suit, i));
      }
    }

    // shuffle it!
    Collections.shuffle(cards, new Random( ));
  }
  //create a static methods that return an instance of the class
  public static Deck getInstance(){
    if (deck == null){ deck = new Deck();}
    return deck;  
  }

  public void print( ) {
    for(Card card: cards) {
      card.print( );
    }
  }

  private List<Card> cards;
}

