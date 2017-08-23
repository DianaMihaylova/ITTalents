package lesson05Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter array's one size:");
		int size1 = sc.nextInt();
		System.out.println("Please enter array's two size:");
		int size2 = sc.nextInt();
		
		while (size1 <= 0 || size2 <= 0) {
			System.out.println("Wrong sizes! Enter a positive numbers!");
			System.out.println("Please enter array's one size:");
			size1 = sc.nextInt();
			System.out.println("Please enter array's two size:");
			size2 = sc.nextInt();
		}
		
		int[] arr1 = new int[size1];
		int[] arr2 = new int[size2];
		
		System.out.println("Please enter elements of the first array:");
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.printf("Enter array element[%d] = ", i);
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("Please enter elements of the second array:");
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.printf("Enter array element[%d] = ", i);
			arr2[i] = sc.nextInt();
		}
		
		int compare = 0;
		
		if (size1 > size2) {
			compare = size1;
			size1 = size2;
			size2 = compare;
		}
		
		int[] newArray = new int[size1];
		
		for (int i = 0; i < newArray.length; i++) {
			if (arr1[i] > arr2[i]) {
				newArray[i] = arr1[i];
			} else {
				newArray[i] = arr2[i];
			}
		}
		System.out.println(Arrays.toString(newArray));
		sc.close();
	}
}
