package lesson01Homework;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an integer number A:");
		int a = sc.nextInt();
		System.out.println("Enter an integer number B:");
		int b = sc.nextInt();
		System.out.println("Enter an integer number C:");
		int c = sc.nextInt();
		
		if (a < b && a < c && b < c) {
			System.out.printf("Descending order of numbers is: %s, %s, %s", c, b, a);
		} else if (a > b && a > c && b > c) {
			System.out.printf("Descending order of numbers is: %s, %s, %s", a, b, c);
		} else if (a < b && a < c && b > c) {
			System.out.printf("Descending order of numbers is: %s, %s, %s", b, c, a);
		} else if (a > b && a > c && b < c) {
			System.out.printf("Descending order of numbers is: %s, %s, %s", a, c, b);
		} else if (a > b && a < c && b < c) {
			System.out.printf("Descending order of numbers is: %s, %s, %s", c, a, b);
		} else if (a < b && a > c && b > c) {
			System.out.printf("Descending order of numbers is: %s, %s, %s", b, a, c);
		}
		sc.close();
	}
}
