package lesson16HomeworkWarGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Deck implements Comparator<Card> {
	
	private List<Card> cardDeck = new ArrayList<Card>();
	private LinkedList<Card> player1Deck = new LinkedList<Card>();
	private LinkedList<Card> player2Deck = new LinkedList<Card>();
	private List<Card> player1WarDeck;
	private List<Card> player2WarDeck;
	private Card player1Card;
	private Card player2Card;
	private Card player1WarCard;
	private Card player2WarCard;
	private int i = 1;
	
	public Deck() {
		for (int i = 0; i < 4; i++) {
			for (int j = 2; j < 15; j++) {
				cardDeck.add(new Card(j, i));
			}
		}
		shuffleCards();
		dealCards();
	}

	private void shuffleCards() {
		Collections.shuffle(cardDeck);
		System.out.println("The all card deck: " + cardDeck);
	}
	
	private void dealCards() {
		player1Deck.addAll(cardDeck.subList(0, 26));
		System.out.println("Player 1 deck: " + player1Deck);
		player2Deck.addAll(cardDeck.subList(26, cardDeck.size()));
		System.out.println("Player 2 deck: " + player2Deck);
	}
	
	public void play() {
		while (i <= 26) {
			player1Card = player1Deck.pop();
			player2Card = player2Deck.pop();
			
			System.out.println("-----------" + i + "-------------");
			System.out.println("Player 1 card is " + player1Card.toString());
            System.out.println("Player 2 card is " + player2Card.toString());
            
            compare(player2Card, player2Card);
            System.out.println("Player 1 deck: " + player1Deck);
            System.out.println("Player 2 deck: " + player2Deck);
            i++; 
		}
		win();
		System.out.println("Player 1 deck: " + player1Deck);
        System.out.println("Player 2 deck: " + player2Deck);
	}
	
	private void war() {
		player1WarDeck = new ArrayList<Card>();
		player2WarDeck = new ArrayList<Card>();
		player1WarDeck.add(player1Card);
		player2WarDeck.add(player2Card);

		for (int j = 0; j < 3; j++) {
			player1WarDeck.add(player1Deck.pop());
			player2WarDeck.add(player2Deck.pop());
			i++;
		}
		player1WarCard = player1WarDeck.get(3);
		player2WarCard = player2WarDeck.get(3);
		System.out.println("Player 1 war card is " + player1WarCard.toString());
		System.out.println("Player 1 war card is " + player2WarCard.toString());
		compareWarCards(player1WarCard, player2WarCard);
	}
	
	private void win() {
		System.out.println("---------WINNER---------");
		if (player1Deck.size() > player2Deck.size()) {
			System.out.println("Player 1 wins the game!");
		} else {
			System.out.println("Player 2 wins the game!");
		}
	}

	@Override
	public int compare(Card o1, Card o2) {
		if (player1Card.getRank() > player2Card.getRank()) {
			System.out.println("Player 1 take the hand!");
			player1Deck.addLast(player1Card);
			player1Deck.addLast(player2Card);
			return 1;
		} else if (player1Card.getRank() < player2Card.getRank()) {
			System.out.println("Player 2 take the hand!");
			player2Deck.addLast(player1Card);
			player2Deck.addLast(player2Card);
			return -1;
		}
		System.out.println("WAR!!!");
		if (i <= 23) {
			war();
		} else {
			System.out.println("It have no enought cards for war!");
			player1Deck.addLast(player1Card);
			player2Deck.addLast(player2Card);
		}
		return 0;
	}
	
	public int compareWarCards(Card c1, Card c2) {
		if (player1WarCard.getRank() > player2WarCard.getRank()) {
			System.out.println("Player 1 wins the war!");
			player1Deck.addAll(player1WarDeck);
			player1Deck.addAll(player2WarDeck);
			return 1;
		} else if (player1WarCard.getRank() < player2WarCard.getRank()) {
			System.out.println("Player 2 wins the war!");
			player2Deck.addAll(player1WarDeck);
			player2Deck.addAll(player2WarDeck);
			return -1;
		} else {
			do {
				player1WarCard = player1Deck.pop();
				player2WarCard = player2Deck.pop();
				player1WarDeck.add(player1WarCard);
				player2WarDeck.add(player2WarCard);
				i++;
			} while (player1WarCard.getRank() == player2WarCard.getRank());
			compareWarCards(player1WarCard, player2WarCard);
		}
		return 0;
	}
}
