package lesson05Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter array size:");
		int size = sc.nextInt();
		
		while(size <= 0) {
			System.out.println("Wrong size! Enter a positive number:");
			size = sc.nextInt();
		}
		
		int[] array = new int[size];
		
		for (int i = 0; i < array.length; i++) {
			System.out.printf("Enter array element[%d] = ", i);
			array[i] = sc.nextInt();
		}
		
		int[] newArray = new int[array.length];
		newArray[0] = array[0];
		newArray[newArray.length - 1] = array[array.length - 1];
		
		for (int i = 1; i < newArray.length - 1; i++) {
			newArray[i] = array[i - 1] + array[i + 1];
		}
		System.out.println(Arrays.toString(newArray));
		sc.close();
	}
}
