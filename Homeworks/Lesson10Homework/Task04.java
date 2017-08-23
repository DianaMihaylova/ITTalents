package lesson10Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number:");
		int element = sc.nextInt();
		
		int[] array = {1, 3, 5, 7, 9, 11, 45};

		int[] newArray = new int[array.length + 1];
		newArray[newArray.length - 1] = element;
		
		for (int i = 0; i <= array.length - 1; i++) {
				newArray[i] = array[i];
		}
		
		for (int i = 0; i < newArray.length; i++) {
			for (int j = 0; j < newArray.length - 1 - i; j++) {
				if (newArray[j] > newArray[j + 1]) {
					int temp = newArray[j];
					newArray[j] = newArray[j + 1];
					newArray[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(newArray));
		sc.close();
	}
}
