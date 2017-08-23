package lesson05Homework;

import java.util.Scanner;

public class Task08 {

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
		
		int rowLength = 1;
		int maxRowLength = 0;
		int numOfLength = 0;
		
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == array[i + 1]) {
				rowLength++;
				numOfLength = array[i];
				maxRowLength = rowLength;
			} else {
				rowLength = 1;
			}
		}
		System.out.print("The longest sequence is: ");
		for (int i = 0; i < maxRowLength; i++) {
			System.out.print(numOfLength + " ");
		}
		sc.close();
	}
}
