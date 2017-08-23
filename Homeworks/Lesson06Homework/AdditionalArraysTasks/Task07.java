package lesson07AdditionalArraysTasks;

public class Task07 {

	public static void main(String[] args) {
		
		int[][] array = {
				{1,4,5,7},
				{2,4,7,9},
				{5,6,5,8},
				{6,4,5,9}
		};
		
		int multip = 1;
		
		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < i; j++) {
				multip *= array[i][j];
			}
		}
		System.out.println("Multiplication is: " + multip);
	}
}
