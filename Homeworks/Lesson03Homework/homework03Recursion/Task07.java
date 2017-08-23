package homework03Recursion;

import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		print(n);
		
		sc.close();
	}
	
	static void print(int a) {
		if (a == 1) {
			System.out.print(3 + " ");
			return;
		}
		if ((a * 3) % 3 == 0) {
			print(a - 1);		
		}
		System.out.print((a * 3) + " ");
	}
}
