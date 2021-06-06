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
		System.out.println("Select \"H\" to (H)it or \"S\" to (S)tand");
		System.out.println("Press Enter to get started.");

//		1. Deal cards to play & dealer, with 1st dealer card being face down
		dealer.shuffle();

		player.hitHand(dealer.dealCard());
		dealer.hitHand(dealer.dealCard());
		dealer.peek();
		player.hitHand(dealer.dealCard());
		dealer.hitHand(dealer.dealCard());
		player.showHand();
		dealer.showHand();
		
//		2. check for either player having blackjack
		dealer.checkBlackjack();
		player.checkBlackjack();

//		3. if neither has blackjack, player hit (H) or stand (S)?
		do{  
            //Player's turn
            do {
            System.out.println("(H)it or (S)tand?");
            input = input.charAt(0);
            } while(!input.equalsIgnoreCase('h') && !input.equalsIgnoreCase('s'));

            if (input.equalsIgnoreCase('h')) {
                player.hitHand(dealer.dealCard());
                System.out.println(player.getHand().getHandValue());
                } else (input.equalsIgnoreCase('s')) {
                System.out.println(player.getHand().getHandValue());
            } 
            //Dealer's turn
		}	while(dealer.hitHand(dealer.dealCard()) {
            System.out.println(dealer.getHand().getHandValue());
        }
	}
}
