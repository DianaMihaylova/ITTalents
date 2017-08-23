package lesson03Homework;

import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number between 3 and 20:");
		int b = Integer.parseInt(sc.nextLine());
		while (b < 3 || b > 20) {
			System.out.println("Wrong number! Enter a number between 3 and 20:");
			b = Integer.parseInt(sc.nextLine());
		}
		System.out.println("Please enter a symbol:");
		String symbol = new String(sc.nextLine());
		
		
		for (int i = 1; i <= b; i++) {
			for (int j = 1; j <= b; j++) {
				if (i == 1 || i == b || j == 1 || j == b) {
					System.out.print("*");
				} else {
					System.out.print(symbol);
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
