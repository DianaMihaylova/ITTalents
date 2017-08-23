package homework03Recursion;

import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a number between 1 and 52:");
		int n = sc.nextInt();

		while (n < 1 || n > 52) {
			System.out.println("Wrong number! Enter a number between 1 and 52:");
			n = sc.nextInt();
		}
		
		int suit = 0;
		String suitColor = "";
		String card = "";
		int cardNum = 0;
		int i = n;
		print(n, suit, suitColor, card, cardNum, i);
		sc.close();
	}
	 static void print(int a, int suit, String suitColor, String card, int cardNum, int i) {
		 if (i == 53) {
			 return;
		 }
		 suit = i % 4;
			if (suit == 0) {
				cardNum = (i / 4) + 1;
			} else {
				cardNum = (i / 4) + 2;
			}

			switch (suit) {
			case 0:
				suitColor = "spade";
				break;
			case 1:
				suitColor = "club";
				break;
			case 2:
				suitColor = "diamond";
				break;
			case 3:
				suitColor = "heart";
				break;
			default:
				System.out.println("Wrong suit!");
				break;
			}

			switch (cardNum) {
			case 11:
				card = "Jack";
				break;
			case 12:
				card = "Queen";
				break;
			case 13:
				card = "King";
				break;
			case 14:
				card = "Ace";
				break;
			default:
				card = String.valueOf(cardNum); 
				break;
			}
			if (i == 52) {
				System.out.print(card + " " + suitColor);
			} else {
				System.out.print(card + " " + suitColor + ", ");
			}
			print(a, suit, suitColor, card, cardNum, i + 1);
	 }
}
