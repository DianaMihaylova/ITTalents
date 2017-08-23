package lesson01Homework;

import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an hour from 0 to 24:");
		byte hour = sc.nextByte();
		
		if (hour > 9 && hour <= 18) {
			System.out.println("Good day");
		} else if (hour > 4 && hour <= 9) {
			System.out.println("Good morning");
		} else {
			System.out.println("Good evening");
		}
		sc.close();
	}
}
