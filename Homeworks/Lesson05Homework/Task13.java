package lesson05Homework;

import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a positive number:");
		int n = sc.nextInt();
		
		while (n <= 0) {
			System.out.println("Wrong number! Enter a positive number:");
			n = sc.nextInt();
		}
		
		int numDiv = n;
		int length = 0;
		
		while (numDiv >= 0) {
			numDiv = numDiv / 2;
			length++;
			if (numDiv == 0) {
				break;
			}
		}
		
		int modulNum = 0;
		int[] array = new int[length];
		
		for (int i = array.length - 1; i >= 0; i--) {
			modulNum = n % 2;
			array[i] = modulNum;
			n = n / 2;
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		sc.close();
	}
}
