package lesson10Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Task05 {

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
		
		int i = 0;
		int j = 0;
		
		System.out.println(Arrays.toString(returnArr(newArray, i, j)));
		sc.close();
	}
			
	static int[] returnArr(int[] arr, int i, int j) {
		if (i == arr.length) {
			return arr;
		}
		reArr(arr, i, j);
		return returnArr(arr, i + 1, j);
	}
	
	static void reArr(int[] arr, int i, int j) {
		if (j == arr.length - 1 - i) {
			return;
		}
		if (arr[j] > arr[j + 1]) {
			int temp = arr[j];
			arr[j] = arr[j + 1];
			arr[j + 1] = temp;
		}
		reArr(arr, i, j + 1);
	}
}


