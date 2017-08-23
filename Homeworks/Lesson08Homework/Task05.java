package lesson08Homework;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a word1:");
		String word1 = sc.nextLine();
		System.out.println("Please enter a word2:");
		String word2 = sc.nextLine();
		
		boolean check = false;
		char equalSymbol = ' ';
		
		for (int i = 0; i < word2.length(); i++) {
			if (word2.charAt(i) == word1.charAt(0)) {
				equalSymbol = word2.charAt(i);
				check = true;
				break;
			}
			if (check) {
				break;
			}
		}
	
		for (int i = 0; i < word2.length(); i++) {
			if (!check) {
				System.out.println("There is no equal symbol.");
				break;
			}
			if (word2.charAt(i) == equalSymbol) {
				System.out.print(word2.charAt(i) + word1.substring(1, word1.length()));
				System.out.println();
			} else {
				System.out.println(word2.charAt(i));
			}
		}
		sc.close();
	}
}
