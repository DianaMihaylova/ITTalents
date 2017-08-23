package homework03Recursion;

import java.util.Scanner;

public class Task25 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(factorial(n));
		sc.close();
	}
	
	static int factorial(int a) {
		if (a == 1) {
			return 1;
		}
		return a * factorial(a - 1);
	}
}
