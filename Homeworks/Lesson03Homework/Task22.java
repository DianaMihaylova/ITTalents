package lesson03Homework;

import java.util.Scanner;

public class Task22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number between 1 and 999:");
		int n = sc.nextInt();
		
		while (n < 1 || n > 999) {
			System.out.println("Wrong number! Enter a number between 1 and 999:");
			n = sc.nextInt();
		}
		
		int num = n + 1;
		int index = 0;
		
		while (index < 10) {
			if ((num % 2 == 0) || (num % 3 == 0) || (num % 5 == 0)) {
				index++;
				if (index != 10) {
					System.out.print(index + ":" + num + ", ");
				} else {
					System.out.print(index + ":" + num);
				}
			} 
			num++;
		}
		sc.close();
	}
}
