package com.skilldistillery.cards.common;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CardsApp extends Hand{
	Deck deck = new Deck();

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CardsApp app = new CardsApp();
		app.launch(input);
		input.close();
	}

	private void launch(Scanner input) {
		int howManyCards;
		try {
			System.out.print("How many cards would you like? ");
			howManyCards = input.nextInt();
			if (howManyCards > 52) {
				throw new RuntimeException("Too many cards requested");
			}
		} catch (InputMismatchException e) {
			System.err.println("Invalid input. Start over");
			return;
		} catch (RuntimeException re) {
			System.err.println(re);
			return;
		}
		deck.shuffle();
		Hand hand = new Hand();
		for (int i = 0; i < howManyCards; i++) {
//			Card card = deck.dealCard();
//			System.out.println(card);
//			hand.addCard(card);
			hand.addCard(deck.dealCard());
		}
		hand.displayHand();
		System.out.println("Hand value: " + hand.getHandValue());
	}
}