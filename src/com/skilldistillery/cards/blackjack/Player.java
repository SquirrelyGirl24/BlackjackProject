package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Hand;

public class Player extends Hand {
//	private Hand hand = new hand();
	private Player player;
	
	public boolean isBlackjack() {
		if (player.getHandValue() == 21) {
			System.out.println("Player has Blackjack!");
			return true;
		} else {
			return false;
		}
	}
	public void dealCard(Card card) {
		player.dealCard(card);
	}
	public String getHandString() {
		String str = "Cards: " + player.toString();
		return str;
		}
	public void clearHand() {
		player.fold();
	}
}
 