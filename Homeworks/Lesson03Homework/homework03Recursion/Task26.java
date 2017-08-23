package homework03Recursion;

import java.util.Scanner;

public class Task26 {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int firstNum = 1;
		int secondNum = 1;
		int thirdNum = firstNum + secondNum;
		
		System.out.println(sumOfNums(n, 1, firstNum, secondNum, thirdNum));
		sc.close();
	}
	
	static int sumOfNums(int n, int i, int f1, int f2, int f3) {
		if (i == n - 1) {
			return f3;
		}
		f3 = f1 + f2;
		f1 = f2;
		f2 = f3;
		return sumOfNums(n, i + 1, f1, f2, f3);
	}
}
