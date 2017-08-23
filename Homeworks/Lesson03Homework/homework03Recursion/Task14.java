package homework03Recursion;

import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		printNum(n);
		sc.close();
	}
	
	static void printNum(int i) {
		if (i == 10) {
			return;
		}
		if (i % 7 == 0) {
			System.out.println(i);
		}
		printNum(i - 1);
	}
}
