package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Hand;

public class Player {
	private Hand hand = new hand();

	public boolean isBlackjack() {
		if (hand.getHandValue() == 21) {
			return true;
		} else {
			return false;
		}
	}
	public void addCard(Card card) {
		hand.addCard(card);
	}
	public String getHandString() {
		String str = "Cards: " + hand.toString();
		}
	public void clearHand() {
		hand.fold();
	}
}
 