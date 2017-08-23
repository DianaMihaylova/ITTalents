package lesson01Homework;

import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a two-digit number A:");
		byte a = sc.nextByte();
		System.out.println("Enter a two-digit number B:");
		byte b = sc.nextByte();
		
		if (a < 10 || a > 99 || b < 10 || b > 99) {
			System.out.println("Wrong numbers!!! Try again");
		} else {
			short multipOfNums = (short) (a * b);
			byte evenOddNum = (byte) (multipOfNums % 10);
			if (evenOddNum % 2 == 0) {
				System.out.println(multipOfNums + ", " + evenOddNum + " -> the number is even");
			} else {
				System.out.println(multipOfNums + ", " + evenOddNum + " -> the number is odd");
			}
		}
		sc.close();
	}
}
