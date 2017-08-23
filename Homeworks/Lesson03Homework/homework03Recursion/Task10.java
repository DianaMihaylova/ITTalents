package homework03Recursion;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		boolean check = true;
		
		primeNum(n, 2, check);
		sc.close();
	}
	
	static void primeNum(int a, int i, boolean check) {
		if (i == a) {
			System.out.println("The num is prime: " + check);
			return;
		}
		if (a % i == 0) {
			check = false;
		}
		primeNum(a, i + 1, check);
	}
}
