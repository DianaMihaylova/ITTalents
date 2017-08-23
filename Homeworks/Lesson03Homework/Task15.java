package lesson03Homework;

import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a positive number:");
		int n = sc.nextInt();
		
		while (n <= 0) {
			System.out.println("Wrong number! Enter a positive number > 0:");
			n = sc.nextInt();
		}
		
		int x = 1;
		int sum = 0;
		do {
			sum += x;
			x++;
		} while (x <= n);
		System.out.println("The sum of all numbers is: " + sum);
		sc.close();
	}
}
