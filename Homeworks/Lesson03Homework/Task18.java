package lesson03Homework;

import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number X between 1 and 9:");
		int x = sc.nextInt();
		System.out.println("Please enter a number Y between 1 and 9:");
		int y = sc.nextInt();
		
		while (x < 1 || y < 1 || x > 9 || y > 9) {
			System.out.println("Wrong numbers! Enter other numbers!");
			System.out.println("Please enter a number X between 1 and 9:");
			x = sc.nextInt();
			System.out.println("Please enter a number Y between 1 and 9:");
			y = sc.nextInt();
		}
		
		int multiplication = 0;
		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= y; j++) {
				multiplication = i * j;
				System.out.println(i + "*" + j + " = " + multiplication + ";");
			}
		}
		sc.close();
	}
}
