package homework03Recursion;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		printNumbers(a, b);
		sc.close();
	}
	
	static void printNumbers(int a, int b) {
		if (a > b) {
			int c = a;
			a = b;
			b = c;
		}
		if (b == a) {
			System.out.print(a + " ");
			return;
		}
		printNumbers(a, b - 1);
		System.out.print(b + " ");
	}
}
