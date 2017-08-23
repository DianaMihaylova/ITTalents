package lesson01Homework;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an integer number A:");
		int a = sc.nextInt();
		System.out.println("Enter an integer number B:");
		int b = sc.nextInt();
		
		if (a < b) {
			System.out.println("Increasing order of numbers is: " + a + ", " + b);
		} else {
			System.out.println("Increasing order of numbers is: " + b + ", " + a);
		}
		sc.close();
	}
}
