package lesson03Homework;

import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number A:");
		int a = sc.nextInt();
		System.out.println("Enter a number B:");
		int b = sc.nextInt();
		
		int c = 0;
		if (a > b) {
			c = a;
			a = b;
			b = c;
		}
		
		int degreeNum = 0;
		int sum = 0;
		
		for (int i = a; i <= b; i++) {
			if (i % 3 == 0) {
				if (i == b) {
					System.out.print("skip " + i);
				} else {
					System.out.print("skip " + i + ", ");
				}
				continue;
			} 
			degreeNum = i * i;
			sum += degreeNum;
			if (sum < 200) {
				if (i == b) {
					System.out.print(degreeNum);
				} else {
					System.out.print(degreeNum + ", ");
				}
			} else {
				System.out.print(degreeNum);
				break;
			}
			degreeNum = 0;
		}
		sc.close();
	}
}
