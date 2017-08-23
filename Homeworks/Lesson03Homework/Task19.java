package lesson03Homework;

import java.util.Scanner;

public class Task19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number between 10 and 99:");
		int n = sc.nextInt();
		
		while (n < 10 || n > 99) {
			System.out.println("Wrong number! Enter a number between 10 and 99:");
			n = sc.nextInt();
		}
		
		int sum = 0;
		while (true) {
			if ((n - 1) % 2 == 0) {
				sum = (n * 3) + 1;
				System.out.print(sum + " ");
			} else {
				sum = (int) (n * 0.5);
				System.out.print(sum + " ");
			}
			n = sum;
			if (n == 1) {
				break;
			}
		}
		sc.close();
	}
}
