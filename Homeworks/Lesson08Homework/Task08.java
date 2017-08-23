package lesson08Homework;

import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a word:");
		String text = sc.nextLine();
		
		char[] textArray = text.toCharArray();
		
		boolean palindrome = true;
		int length = textArray.length - 1;
		
		for (int i = 0; i < textArray.length; i++) {
			if (textArray[i] != textArray[length - i]) {
				palindrome = false;
			}
		}
		System.out.println("The word is palindrome: " + palindrome);
		sc.close();
	}
}
