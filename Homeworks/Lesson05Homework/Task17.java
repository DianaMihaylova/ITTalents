package lesson05Homework;

import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter array size:");
		int size = sc.nextInt();
		
		while (size <= 0) {
			System.out.println("Wrong size! Enter a positive number:");
			size = sc.nextInt();
		}
		
		int[] array = new int[size];
		
		for (int i = 0; i < array.length; i++) {
			System.out.printf("Enter array element[%d] = ", i);
			array[i] = sc.nextInt();
		}
		
		boolean check = true;
		
		for (int i = 1; i < array.length - 1; i++) {
			if (i % 2 != 0) {
				if (!(array[i] > array[i - 1] && array[i] > array[i + 1])) {
					check = false;
					break;
				}
			} else {
				if (!(array[i] < array[i - 1] && array[i] < array[i + 1])) {
					check = false;
					break;
				}
			}
		}
		System.out.println("Zigzagged up row: " + check);
		sc.close();
	}
}
