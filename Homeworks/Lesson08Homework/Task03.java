package lesson08Homework;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String word1;
		String word2;
		
		do {
			System.out.println("Please enter a string character 1 without space:");
			word1 = sc.nextLine();
			System.out.println("Please enter a string character 2 without space:");
			word2 = sc.nextLine();
		} while (word1.contains(" ") || word2.contains(" "));
	
		String check;
		
		if (word1.length() == word2.length()) {
			System.out.println("String characters have equal length.");
		} else {
			if (word1.length() > word2.length()) {
				System.out.println("String character 1 is longer than string character 2.");
				check = word1;
				word1 = word2;
				word2 = check;
			} else {
				System.out.println("String character 2 is longer than string character 1.");
			}
		}
		
		System.out.println("Difference positions:");
		for (int i = 0; i < word1.length(); i++) {
			if (word1.charAt(i) == word2.charAt(i)) {
				continue;
			} else {
				System.out.println(i + 1 + " " + word1.charAt(i) + "-" + word2.charAt(i));
			}
		}
		sc.close();
	}
}
