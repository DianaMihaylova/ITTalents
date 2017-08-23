package lesson03Homework;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a first number:");
		int a = sc.nextInt();
		System.out.println("Please enter a second number:");
		int b = sc.nextInt();
		
		int c = 0;
		
		if (a > b) {
			c = a;
			a = b;
			b = c;
		}
		for (int i = a; i <= b; i++) {
			System.out.print(i + " ");
		}
		sc.close();
	}
}
