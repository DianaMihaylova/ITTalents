package homework03Recursion;

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
		
		numbers(n, sum);
		sc.close();
	}
	
	static void numbers(int n, int sum) {
		if (n == 1) {
			return;
		}
		if ((n - 1) % 2 == 0) {
			sum = (n * 3) + 1;
			System.out.print(sum + " ");
		} else {
			sum = (int) (n * 0.5);
			System.out.print(sum + " ");
		}
		numbers(n = sum, sum);
	}
}
