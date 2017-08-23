package lesson01Homework;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number A:");
		double numA = Double.parseDouble(sc.nextLine());
		System.out.println("Please enter a number B:");
		double numB = Double.parseDouble(sc.nextLine());
		System.out.println("Please enter a number C:");
		double numC = Double.parseDouble(sc.nextLine());
		
		if ((numC > numA && numC < numB) || (numC < numA && numC > numB)) {
			System.out.printf("The number %s is between %s and %s", numC, numA, numB);
		} else {
			System.out.printf("The number %s is not between %s and %s", numC, numA, numB);
		}
		sc.close();
	}
}
