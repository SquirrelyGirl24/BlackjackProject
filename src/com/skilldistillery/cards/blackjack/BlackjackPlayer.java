package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;

public class BlackjackPlayer extends Player {
	// every player has cards in their hand

	public BlackjackPlayer() {
		setHand(new BlackjackHand());
	}

	// looking at current hand value
	public void handValue() {
		int handValue = getHand().getHandValue();
		while (handValue <= 20) {
			if (handValue > 21) {
				System.out.println("Player busts!");
			} else {
				System.out.println("Current hand: " + handValue);
			}
		}
	}
	// Get, hit or stand
	public void hitHand(Card card) {
		getHand().addCard(card);
	}
}