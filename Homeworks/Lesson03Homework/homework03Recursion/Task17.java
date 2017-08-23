package homework03Recursion;

import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number between 3 and 20:");
		int b = Integer.parseInt(sc.nextLine());
		while (b < 3 || b > 20) {
			System.out.println("Wrong number! Enter a number between 3 and 20:");
			b = Integer.parseInt(sc.nextLine());
		}
		System.out.println("Please enter a symbol:");
		String symbol = new String(sc.nextLine());
		
		int i = 1;
		int j = 1;
		
		paint(b, i, symbol, j);
		sc.close();
	}
	
	static void paint(int b, int i, String symbol, int j) {
		if (i == b + 1) {
			return;
		}
		paintIn(j, b, symbol, i);
		System.out.println();
		paint(b, i + 1, symbol, j);
	}
	
	static void paintIn(int j, int b, String symbol,int i) {
		if (j == b + 1) {
			return;
		}
		if (i == 1 || i == b || j == 1 || j == b) {
			System.out.print("*");
		} else {
			System.out.print(symbol);
		}
		paintIn(j + 1, b, symbol, i);
	}
}
