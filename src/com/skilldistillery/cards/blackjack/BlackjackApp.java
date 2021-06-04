package com.skilldistillery.cards.blackjack;

import java.util.Scanner;
import com.skilldistillery.cards.common.Deck;

public class BlackjackApp {
	Deck deck = new Deck();

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BlackjackApp app = new BlackjackApp();
		app.launch(input);
		input.close();
	}
	
	private void launch (Scanner input) {
//		1. deal to player
//		   deal to dealer, face down
//		   deal to player
//		   deal to dealer, face up
//		2. check for either player having blackjack
//			if dealer does, dealer wins
//			if player does, player wins
//		3. if neither has blackjack
//			player hit (H) or stand (S)?
//		4. if hit, deal card, getHandValue
//			if <= 20, dealer flips bottom card
//				if dealer <= 17  keep going
//				if = 21 they win 
//				if > 21 they bust
//			player H or S?
//			if = 21 they win 
//			if > 21 they bust
	}
	


}
