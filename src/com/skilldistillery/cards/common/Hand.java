package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {
	private List<Card> cards = new ArrayList<>();

	public void addCard(Card card) {
		cards.add(card);
	}

	public int getHandValue() {
		int value = 0;
		for (Card card : cards) {
			value += card.getValue();
		}
		return value;
	}

	public void fold() {
		cards.clear();
	}

	public boolean dealerPeek() {
		Object[] theHand = null;
		int value = ((Hand) theHand[1]).getHandValue();
		return value == 1 || value >= 10;
	}

	public void displayHand() {
		if (cards.size() == 0) {
			System.out.println("No cards.");
		} else {
			for (Card card : cards) {
				System.out.println(card);
			}
		}
	}
}