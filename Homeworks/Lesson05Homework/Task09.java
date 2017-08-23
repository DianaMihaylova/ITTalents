package lesson05Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Task09 {

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
		
//		With two arrays:
//		int[] newArray = new int[array.length];
		
//		for (int i = 0; i < newArray.length; i++) {
//			newArray[i] = array[array.length - 1 - i];
//		}
//		System.out.println(Arrays.toString(newArray));
		
//		With one array:
		int length = array.length - 1;
		int arrayValue = 0;
		
		for (int i = 0; i <= length / 2; i++) {
			arrayValue = array[i];
			array[i] = array[length - i];
			array[length - i] = arrayValue;
		}
		System.out.println(Arrays.toString(array));
		sc.close();
	}
}
