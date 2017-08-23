package lesson07AdditionalArraysTasks;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enete a symbol:");
		char ch = sc.next().charAt(0);
		
		boolean check = false;
		int index = 0;
		
		char[] arr = {'a','b','c','d','e','f'};
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ch) {
				check = true;
				index = i;
			}
		}
		if (check) {
			System.out.println("The symbol is in array: " + check + ", Index: " + index);
		} else {
			System.out.println("The symbol is not in array!");
		}
		sc.close();
	}
}
