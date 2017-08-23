package lesson03Homework;

import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a positive number:");
		int n = sc.nextInt();
		
		while (n <= 0) {
			System.out.println("Wrong number!!! Enter a positive number:");
			n = sc.nextInt();
		}
		
		int valueToPrint = 0;
		
		for (int i = 1; i <= n; i++) {
			valueToPrint += 2;
			for (int j = 1; j <= n; j++) {
				if (i == 1) {
					valueToPrint = n - 1;
				}
				System.out.print(valueToPrint);
			}
			System.out.println();
		}
		sc.close();
	}
}
