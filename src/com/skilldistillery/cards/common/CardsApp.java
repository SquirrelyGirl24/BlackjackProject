package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CardsApp {
	Deck deck = new Deck();

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CardsApp app = new CardsApp();
		app.launch(input);
		input.close();
	}

	private void launch(Scanner input) {
//		Write a program to ask a user how many cards they want.
		int howManyCards;
		try {
//		Handle the case where users enter a non-integer or a number greater than 52: print an error message.
			System.out.print("How many cards would you like? ");
			howManyCards = input.nextInt();
			if (howManyCards > 52) {
				throw new RuntimeException("Too many cards requested");
			}
		} catch (InputMismatchException e) {
			System.err.println("Invalid input.  Start over");
			return;
		} catch (RuntimeException re) {
			System.err.println(re);
			return;
		}
		deck.shuffle();
//		Deal the cards and display them on the screen. Also display the total value of all cards.
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