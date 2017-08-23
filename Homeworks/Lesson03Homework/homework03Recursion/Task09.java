package homework03Recursion;

import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number A:");
		int a = sc.nextInt();
		System.out.println("Enter a number B:");
		int b = sc.nextInt();
		
		int degreeNum = 0;
		int sum = 0;
		
		printNum(a, b, sum, degreeNum);
		sc.close();
	}
	
	static void printNum(int i, int j, int sum, int degreeNum) {
		if (i > j) {
			int temp = i;
			i = j;
			j = temp;
		}
		if (i == j) {
			return;
		}
		if (sum > 200) {
			return;
		}
		if (i % 3 == 0) {
			System.out.print("skip " + i + " ");
		} else {
			degreeNum = i * i;
			sum += degreeNum;
			System.out.print(degreeNum + " ");
			degreeNum = 0;
		}
		printNum(i + 1, j, sum, degreeNum);
	}
}
