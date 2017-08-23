package homework03Recursion;

import java.util.Scanner;

public class Task27 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int sum = 0;
		
		System.out.println(sum(x, y, sum));
		sc.close();
	}
	
	static int sum(int a, int b, int sum) {
		if (a == 0) {
			return sum;
		}
		sum += b;
		return sum(a - 1, b, sum);
	}
}
