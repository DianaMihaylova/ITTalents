package homework03Recursion;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a positive number > 1:");
		int n = sc.nextInt();
		
		int space = n - 1;
		int stars = 1;
		int i = 1;
		int j = 1;
		int k = 1;
		
		printTriangle(i, n, space, stars, j, k);
		sc.close();
	}
	
	static void printTriangle(int i, int n, int space,int stars, int j, int k) {
		if (i == n + 1) {
			return;
		}
			space(j, space);
			stars(k, stars);
			space--;
			stars += 2;
			System.out.println();
			printTriangle(i + 1, n, space, stars, j, k);
	}
	
	static void space(int j, int space) {
		if (j == space + 1) {
			return;
		}
		System.out.print(" ");
		space(j + 1, space);
	}
	
	static void stars(int k, int stars) {
		if (k == stars + 1) {
			return;
		}
		System.out.print("*");
		stars(k + 1, stars);
	}
}
