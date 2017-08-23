package lesson05Homework;

import java.util.Scanner;

public class Task04 {

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
		
		int num = array.length - 1;
		boolean symmetricArrays = true;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] != array[num]) {
				symmetricArrays = false;
				break;
			}
			num--;
		}
		System.out.println("The array is symmetric: " + symmetricArrays);
		sc.close();
	}
}
