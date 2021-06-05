package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

public class BlackjackApp {
	BlackjackPlayer player = new BlackjackPlayer();
	Dealer dealer = new Dealer();

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BlackjackApp app = new BlackjackApp();
		app.launch(input);
		input.close();
	}

	private void launch(Scanner input) {
		System.out.println("Welcome to Blackjack!");
		System.out.println("Select \"H\" to \\(H\\)it or \"S\" to \\(S\\)tand");
		System.out.println("Press Enter to get started.");

//		1. Deal cards to play & dealer, with 1st dealer card being face down
		dealer.shuffle();

		player.hitHand(dealer.dealCard());
		dealer.hitHand(dealer.dealCard());
//		dealer.peek().conceal();
		player.hitHand(dealer.dealCard());
		dealer.hitHand(dealer.dealCard());
		player.showHand();
//		dealer.peek().reveal();
//		dealer.showHand();
		dealer.checkBlackjack();
		player.checkBlackjack();
	}
//		2. check for either player having blackjack
	
//		3. if neither has blackjack
//			player hit (H) or stand (S)?
//		TODO sysout ask hit or stand?
//		4. if hit, deal card, getHandValue
//			if <= 20, dealer flips bottom card
//				if dealer <= 16, keep going
//				if dealer = 17, dealer stands
//				if = 21 they win 
//				if > 21 they bust
//			player H or S?
//			if <= 20, can keep going
//			if = 21 they win 
//			if > 21 they bust

}
