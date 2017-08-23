package homework03Recursion;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		System.out.println(sum(a));
		sc.close();
	}
	
	static int sum(int a) {
		if (a == 1) {
			return 1;
		}
		return a + sum(a - 1);
	}
}
