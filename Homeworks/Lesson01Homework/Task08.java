package lesson01Homework;

import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a four-digit number between 1000 and 9999:");
		short abcd = sc.nextShort();
		
		if (abcd < 1000 || abcd > 9999) {
			System.out.println("The number is not valid!!! Try again");
		} else {
			byte a = (byte) ((abcd / 1000) % 10);
			byte b = (byte) ((abcd / 100)  % 10);
			byte c = (byte) ((abcd / 10) % 10);
			byte d = (byte) (abcd % 10);
			byte numOne = (byte) ((a * 10) + (d * 1));
			byte numTwo = (byte) ((b * 10) + (c * 1));
			if (numOne > numTwo) {
				System.out.printf("Bigger (%s > %s)", numOne, numTwo);
			} else if (numOne < numTwo) {
				System.out.printf("Smaller (%s < %s)", numOne, numTwo);
			} else {
				System.out.printf("Equal (%s = %s)", numOne, numTwo);
			}
		}
		sc.close();
	}
}
