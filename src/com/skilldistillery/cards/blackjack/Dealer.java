package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class Dealer extends BlackjackPlayer {
	private Deck deck;

public Dealer() {
	setHand(new BlackjackHand());
}
	// deal cards from deck
	public Card dealCard() {
		return deck.dealCard();
	}
	public void shuffle () {
		deck.shuffle();
	}
	// display dealer hand
	public void dealerHandValue() {
		int dealerHandValue = getHand().getHandValue();
		while (dealerHandValue <= 17) {
			if (dealerHandValue > 21) {
				System.out.println("Dealer busts.");
			} 
			else {
				System.out.println("Dealer has: " + dealerHandValue);
			}
		}
	}
	// Hit or Stand?
	public void hitHand(Card card) {
		getHand().addCard(card);
	}
	public boolean peek() {
		return getHand().dealerPeek();
	}

}
