package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Hand;

public class BlackjackHand extends Hand {

	@Override
	public int getHandValue() {
		return super.getHandValue();
	}

	public boolean isBlackjack() {
		if (getHandValue() == 21) {
			System.out.println("Blackjack!");
			return true;
		} else {
			return false;
		}
	}
}
