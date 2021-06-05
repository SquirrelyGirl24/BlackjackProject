package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Hand;

public abstract class Player {
	private Hand hand;

	public Hand getHand() {
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}
	
	public void showHand() {
		hand.displayHand();
	}
	
	public void checkBlackjack() {
		((BlackjackHand) hand).isBlackjack();
	}
	
}
 