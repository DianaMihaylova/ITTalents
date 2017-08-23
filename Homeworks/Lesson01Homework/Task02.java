package lesson01Homework;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter an integer number A:");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("Please enter an integer number B:");
		int b = Integer.parseInt(sc.nextLine());
		System.out.println("Please enter an floating point number C:");
		double c = Double.parseDouble(sc.nextLine());
		System.out.println("Please enter an floating point number D:");
		double d = Double.parseDouble(sc.nextLine());
		
		int sumOfNums = a + b;
		int subtractOfNums = a - b;
		int multipOfNums = a * b;
		int divisionOfNums = a / b;
		int modulusOfNums = a % b;
		
		double sumOfDoubleNums = c + d;
		double subtractOfDoubleNums = c - d;
		double multipOfDoubleNums = c * d;
		double divisionOfDoubleNums = c / d;
		double modulusOfDoubleNums = c % d;
		
		System.out.println();
		
		System.out.println("The sum of A and B is: " + sumOfNums);
		System.out.println("The subtraction of A and B is: " + subtractOfNums);
		System.out.println("The multiplication of A and B is: " + multipOfNums);
		System.out.println("The division of A and B is: " + divisionOfNums);
		System.out.println("The modulus of A and B is: " + modulusOfNums);
		
		System.out.println();
		
		System.out.println("The sum of C and D is: " + String.format("%.2f", sumOfDoubleNums));
		System.out.println("The subtraction of C and D is: " + String.format("%.2f", subtractOfDoubleNums));
		System.out.println("The multiplication of C and D is: " + String.format("%.2f", multipOfDoubleNums));
		System.out.println("The division of C and D is: " + String.format("%.2f",divisionOfDoubleNums));
		System.out.println("The modulus of C and D is: " + Math.round(modulusOfDoubleNums));
		
		sc.close();
	}
}
