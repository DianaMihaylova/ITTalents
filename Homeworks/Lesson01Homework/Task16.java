package lesson01Homework;

import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a three-digit number:");
		short abc = sc.nextShort();
		
		byte a = (byte) ((abc / 100) % 10);
		byte b = (byte) ((abc / 10) % 10);
		byte c = (byte) (abc % 10);
		
		if ((a < b) && (b < c)) {
			System.out.println("The numbers are in ascending order");
		} else if ((a > b) && (b > c)) {
			System.out.println("The numbers are in descending order");
		} else if ((a == b) && (b == c)) {
			System.out.println("The numbers are equal");
		} else {
			System.out.println("The numbers are unassigned for unrecorded cases");
		}
		sc.close();
	}
}
