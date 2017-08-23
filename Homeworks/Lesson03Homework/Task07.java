package lesson03Homework;

import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a positive number:");
		int n = sc.nextInt();
		
		while (n <= 0) {
			System.out.println("Wrong number!!! Enter a positive number:");
			n = sc.nextInt();
		}
		
		for (int i = 3; i <= n * 3; i++) {
			if (i % 3 == 0) {
				if (i != n * 3) {
					System.out.print(i + ",");
				} else {
					System.out.print(i);
				}
			}
		}
		sc.close();
	}
}
