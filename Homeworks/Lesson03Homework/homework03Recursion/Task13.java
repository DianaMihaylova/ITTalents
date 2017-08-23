package homework03Recursion;

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
		
		int a = 100;
		int b = 999;
		
		sum(a, b, n);
		sc.close();
	}
	
	static void sum(int i, int j, int n) {
		if (i == j + 1) {
			return;
		}
		int a = (i / 100) % 10;
		int b = (i / 10) % 10;
		int c = i % 10;
		if ((a + b + c) == n) {
			System.out.println(i);
		}
		sum(i + 1, j, n);
	}
}
