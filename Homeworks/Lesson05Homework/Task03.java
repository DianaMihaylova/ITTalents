package lesson05Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number:");
		int n = sc.nextInt();
		
		int[] array = new int[10];
		array[0] = n;
		array[1] = n;
		
		for (int i = 2; i < array.length; i++) {
			array[i] = array[i - 1] + array[i - 2];
		}
		System.out.println(Arrays.toString(array));
		sc.close();
	}
}
