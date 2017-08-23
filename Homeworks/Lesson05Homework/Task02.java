package lesson05Homework;

import java.util.Scanner;

public class Task02 {

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
		
		int[] arrayNew = new int[array.length * 2];
		int num = array.length - 1;
		
		for (int i = 0; i < arrayNew.length; i++) {
			if (i < array.length) {
				arrayNew[i] = array[i];
			} else {
				arrayNew[i] = array[num];
				num--;
			}
			System.out.print(arrayNew[i] + " ");
		}
		sc.close();
	}
}
