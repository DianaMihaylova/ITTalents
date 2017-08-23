package lesson03Homework;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a positive number:");
		int n = sc.nextInt();
		
		while (n <= 0) {
			System.out.println("Wrong number!!! Enter a positive number:");
			n = sc.nextInt();
		}
		
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("The result is " + sum);
		sc.close();
	}
}
