package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;
import com.skilldistillery.cards.common.Hand;

public class Dealer extends Hand{
//	private Hand hand = new hand();
	private Dealer dealer;
	
	public boolean isBlackjack() {
		if (dealer.getHandValue() == 21) {
			System.out.println("Dealer has Blackjack!");
			return true;
		} else {
			return false;
		}
	}

	public void dealerPlay(Deck deck) {
		while (dealer.getHandValue() <= 17) {
			System.out.println("Dealer has " + dealer.getHandValue());
			dealer.dealCard(deck.dealCard());
			System.out.println("Dealer " + this.getHandString(true, false));
		}
		if (dealer.getHandValue() > 21) {
			System.out.println("Dealer busts." + this.getHandString(true, false));
		} else {
			System.out.println("Dealer stands." + this.getHandString(true, false));
		}
	}
	public void dealCard(Card card) {
		dealer.dealCard(card);
	}
	public String getHandString(boolean isDealer, boolean hideHoleCard) {
		String str = "Cards:" + dealer.toString();
		return str;
	}
	public void clearHand() {
		dealer.fold();
	}
	public boolean peek() {
		return dealer.dealerPeek();
	}
}
