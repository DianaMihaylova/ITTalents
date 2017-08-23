package lesson08Homework;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String word1;
		String word2;
		
		do {
			System.out.println("Please eneter a word1 which contains between 6 and 20 characters:");
			word1 = sc.nextLine();
			System.out.println("Please eneter a word2 which contains between 6 and 20 characters:");
			word2 = sc.nextLine();
		} while (word1.length() < 6 || word1.length() > 20 || word2.length() < 6 || word2.length() > 20);
		
		if (word1.length() > word2.length()) {
			System.out.print(word1.length());
		} else {
			System.out.print(word2.length());
		}
		System.out.print(" ");
		
		char[] word1Length = word1.toCharArray();
		char[] word2Length = word2.toCharArray();
		
		char check;

		for (int i = 0; i < word1Length.length; i++) {
			if (i < 5) {
				check = word1Length[i];
				word1Length[i] = word2Length[i];
				word2Length[i] = check;
			}
			System.out.print(word1Length[i]);
		}
		System.out.print(" ");
		System.out.print(word2Length);
		sc.close();
	}
}
