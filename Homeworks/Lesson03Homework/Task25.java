package lesson03Homework;

import java.util.Scanner;

public class Task25 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a positive number:");
		int n = sc.nextInt();
		
		while (n <= 0) {
			System.out.println("Wrong number! Enter a positive number:");
			n = sc.nextInt();
		}
		
		int num = 1;
		int factorial = 1;
		
		do {
			factorial *= num;
			num++;
		} while (num <= n);
		
		System.out.println(factorial);
		sc.close();
	}
}
