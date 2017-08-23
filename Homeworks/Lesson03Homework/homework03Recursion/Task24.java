package homework03Recursion;

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
		
		palindrome(n, modul, sum, reverseNum);
		sc.close();
	}

	static void palindrome(int n, int modul, int sum, int reverseNum) {
		if (reverseNum == 0) {
			if (n == sum) {
				System.out.println("Palindrome number");
			} else {
				System.out.println("Not palindrome number");
			}
			return;
		}
		modul = reverseNum % 10;
		sum = (sum * 10) + modul;
		palindrome(n, modul, sum, reverseNum / 10);
	}
}
