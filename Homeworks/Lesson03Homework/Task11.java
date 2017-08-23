package lesson03Homework;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a positive number > 1:");
		int n = sc.nextInt();
		
		while (n <= 1) {
			System.out.println("Wrong number!!! Please enter a positive number > 1:");
			n = sc.nextInt();
		}
		
		// Filled triangle of stars
		/*int space = n - 1;
		int stars = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= space; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= stars; k++) {
				System.out.print("*");
			}
			space--;
			stars += 2;
			System.out.println();
		}*/
		
		// Hollow triangle of stars
		int space = n - 1;
		int stars = 1;
		
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= space; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= stars; k++) {
				if (i == 1 || i == n || k == 1 || k == stars) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			space--;
			stars += 2;
			System.out.println();
		}
		sc.close();
	}
}
