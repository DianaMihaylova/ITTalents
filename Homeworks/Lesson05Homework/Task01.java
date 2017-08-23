package lesson05Homework;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array size:");
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
		
		int minElement = array[0];
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 3 == 0) {
				if (minElement > array[i] || minElement == 1 || minElement == 2 || minElement == -1 || minElement == -2) {
					minElement = array[i];
				}
			} 
		}
		System.out.printf("The smallest number divisible by 3 is %d", minElement);
		sc.close();
	}
}
