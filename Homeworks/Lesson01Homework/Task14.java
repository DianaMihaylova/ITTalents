package lesson01Homework;

import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter position of integer numbers between 1 and 8:");
		System.out.println("Enter position x1: ");
		byte x1 = sc.nextByte();
		System.out.println("Enter position y1: ");
		byte y1 = sc.nextByte();
		System.out.println("Enter position x2: ");
		byte x2 = sc.nextByte();
		System.out.println("Enter position y2: ");
		byte y2 = sc.nextByte();
		
		if (((x1 + y1) % 2 == 0) == ((x2 + y2) % 2 == 0)) {
			System.out.println("Two pairs are in the same color");
		} else {
			System.out.println("Two pairs are in different color");
		}
		sc.close();
	}
}
