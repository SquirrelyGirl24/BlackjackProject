package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;
import com.skilldistillery.cards.common.Hand;

public class Dealer {

	private Hand hand = new hand();

	public boolean isBlackjack() {
		if (hand.getHandValue() == 21) {
			return true;
		} else {
			return false;
		}
	}

	public void dealerPlay(Deck deck) {
		while (hand.getHandValue() <= 17) {
			System.out.println("Dealer has " + hand.getHandValue());
			hand.addCard(deck.dealCard());
			System.out.println("Dealer " + this.getHandString(true, false));
		}
		if (hand.getHandValue() > 21) {
			System.out.println("Dealer busts." + this.getHandString(true, false));
		} else {
			System.out.println("Dealer stands." + this.getHandString(true, false));
		}
	}
	public void addCard(Card card) {
		hand.addCard(card);
	}
	public String getHandString(boolean isDealer, boolean hideHoleCard) {
		String str = "Cards:" + hand.toString();
		return str;
	}
	public void clearHand() {
		hand.fold();
	}
	public boolean peek() {
		return hand.dealerPeek();
	}
}
