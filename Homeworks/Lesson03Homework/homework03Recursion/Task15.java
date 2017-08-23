package homework03Recursion;

import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		System.out.println(sum(n, sum));
		sc.close();
	}
	
	static int sum(int i, int sum) {
		if (i == 1) {
			return 1;
		}
		sum += i;
		return i + sum(i - 1, sum);
	}
}
