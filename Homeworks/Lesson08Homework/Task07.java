package lesson08Homework;

import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String text;
		
		do {
			System.out.println("Please enter à few words separated by a space:");
			text = sc.nextLine();
		} while (!text.contains(" "));
		
		String[] textArray = text.split(" ");
		
		int longestWord = 0;
		
		for (int i = 0; i < textArray.length; i++) {
			if (textArray[i].length() > longestWord) {
				longestWord = textArray[i].length();
			}
		}
		System.out.println(textArray.length + " words, the longest word is " + longestWord + " symbols.");
		sc.close();
	}
}
