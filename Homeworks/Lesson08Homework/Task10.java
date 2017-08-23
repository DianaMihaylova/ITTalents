package lesson08Homework;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a word:");
		String text = sc.nextLine();
		
		char[] textArray = text.toCharArray();
		char[] newArray = new char[textArray.length];
		
		for (int i = 0; i < textArray.length; i++) {
			newArray[i] = (char) (textArray[i] + 5);
			System.out.print(newArray[i]);
		}
		sc.close();
	}
}
