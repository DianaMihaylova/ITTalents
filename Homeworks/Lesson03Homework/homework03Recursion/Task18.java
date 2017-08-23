package homework03Recursion;

import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number X between 1 and 9:");
		int x = sc.nextInt();
		System.out.println("Please enter a number Y between 1 and 9:");
		int y = sc.nextInt();
		
		while (x < 1 || y < 1 || x > 9 || y > 9) {
			System.out.println("Wrong numbers! Enter other numbers!");
			System.out.println("Please enter a number X between 1 and 9:");
			x = sc.nextInt();
			System.out.println("Please enter a number Y between 1 and 9:");
			y = sc.nextInt();
		}
		
		int i = 1;
		int j = 1;
		int multiplication = 0;
		
		print(x, i, j, multiplication, y);
		sc.close();
	}
	
	static void print(int a, int i, int j, int multiplication, int b) {
		if (i == a + 1) {
			return;
		}
		printIn(b, j, multiplication, i);
		print(a, i + 1, j, multiplication, b);
	}
	
	static void printIn(int b, int j, int multiplication, int i) {
		if (j == b + 1) {
			return;
		}
		multiplication = i * j;
		System.out.println(i + "*" + j + " = " + multiplication + ";");
		printIn(b, j + 1, multiplication, i);
	}
}
