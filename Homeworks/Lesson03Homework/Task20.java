package lesson03Homework;

public class Task20 {

	public static void main(String[] args) {
		
		int sumOfRow = 0;
		
		for (int i = 1; i <= 10; i++) {
			for (int j = i; j <= 9; j++) {
				sumOfRow += j;		
 				System.out.print(j + " ");
 				if (j == 9) {
 					System.out.print(0 + " ");
 				}
			}
			if (i == 10) {
				System.out.print(0 + " ");
			}
			if (sumOfRow < 45) {
				for (int j2 = 1; j2 <= 9; j2++) {
					sumOfRow += j2;
					System.out.print(j2 + " ");
					if (sumOfRow == 45) {
						break;
					}
				}
			}
			sumOfRow = 0;
			System.out.println();
		}	
	}
}
