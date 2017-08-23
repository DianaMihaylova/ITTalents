package homework03Recursion;

import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number N between 10 and 5555:");
		int n = sc.nextInt();
		System.out.println("Please enter a number M between 10 and 5555:");
		int m = sc.nextInt();
		
		while (n < 10 || m < 10 || n > 5555 || m > 5555) {
			System.out.println("Wrong numbers! Try again.");
			System.out.println("Please enter a number N between 10 and 5555:");
			n = sc.nextInt();
			System.out.println("Please enter a number M between 10 and 5555:");
		    m = sc.nextInt();
		}
		
		printNum(n, m);
		sc.close();
	}
	
	static void printNum(int a, int b) {
		if (a < b) {
			int temp = a;
			a = b;
			b = temp;
		}
		if (a == b) {
			return;
		}
		if (a % 50 == 0) {
			System.out.print(a + " ");
		}
		printNum(a - 1, b);
	}
}
