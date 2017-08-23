package lesson08Homework;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String text;
		
		do {
			System.out.println("Please enter a sentence:");
			text = sc.nextLine();
		} while (!text.contains(" "));
		
		String[] testArray = text.split(" ");
		
		String upperCase;

		for (int i = 0; i < testArray.length; i++) {
			upperCase = testArray[i].substring(0, 1).toUpperCase() + testArray[i].substring(1) + " ";
			System.out.print(upperCase);
		}
		sc.close();
	}
}
