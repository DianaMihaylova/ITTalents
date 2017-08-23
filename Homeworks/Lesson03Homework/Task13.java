package lesson03Homework;

import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number between 1 and 27:");
		int n = sc.nextInt();
		
		while (n < 1 || n > 27) {
			System.out.println("Wrong number! Please enter a number between 1 and 27:");
			n = sc.nextInt();
		}
		
		for (int i = 100; i <= 999; i++) {
			int a = (i / 100) % 10;
			int b = (i / 10) % 10;
			int c = i % 10;
			if ((a + b + c) != n) {
				continue;
			} else {
				System.out.println(i);
			}	
		}
		sc.close();
	}
}
