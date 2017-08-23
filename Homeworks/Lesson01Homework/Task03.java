package lesson01Homework;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter an integer number A:");
		int a = sc.nextInt();		
		System.out.println("Please enter an integer number B:");
		int b = sc.nextInt();
		int c = a;
		a = b;
		b = c;
		
		System.out.println("A = " + a);
		System.out.println("B = " + b);
		
		sc.close();
	}
}
