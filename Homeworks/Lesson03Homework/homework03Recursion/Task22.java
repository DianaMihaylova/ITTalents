package homework03Recursion;

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
		int i = 0;
		int index = 0;
		print(num,index);
		System.out.println();
		print1(n,i);
		
		sc.close();
	}
	
	static void print(int num, int index) {
		if (index > 9) {
			return;
		}
		if ((num % 2 == 0) || (num % 3 == 0) || (num % 5 == 0)) {
			index++;
			if (index != 10) {
				System.out.print(index + ":" + num + ", ");
			} else {
				System.out.print(index + ":" + num);
			}
		} 
		num++;
		print(num,index);
	}
	
	static void print1(int n, int i) {
		if (i == 10) {
			return;
		}
		if ((n % 2 == 0) || (n % 3 == 0) || (n % 5 == 0)) {
			i += 1;
			System.out.print(i + ":" + n + " ");
		}
		print1(n+1, i);
	}
}
