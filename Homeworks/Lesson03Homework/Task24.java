package lesson03Homework;

import java.util.Scanner;

public class Task24 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number between 10 and 30000:");
		int n = sc.nextInt();
		
		while (n < 10 || n > 30000) {
			System.out.println("Wrong number! Enter a number between 10 and 30000:");
			n = sc.nextInt();
		}
		
		int modul = 0;
		int sum = 0;
		int reverseNum = n;
		
		do {
			modul = reverseNum % 10;
			sum = (sum * 10) + modul;
			reverseNum = reverseNum / 10;
		} while (reverseNum > 0);
		
		if (n == sum) {
			System.out.println("Palindrome number");
		} else {
			System.out.println("Not palindrome number");
		}
		sc.close();
	}
}
