package lesson07AdditionalArraysTasks;

public class Task05 {

	public static void main(String[] args) {
		
		int[][] array = {
				{2,3,6,7},
				{4,3,6,9},
				{2,5,6,8},
				{1,3,0,7}
		};
		
		int rowSum = 0;
		int sumOfRow = 0;
		int index = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				rowSum += array[i][j];
				if (sumOfRow < rowSum) {
					sumOfRow = rowSum;
					index = i + 1;
				}
			}
			rowSum = 0;
		}
		System.out.println("Max sum: " + sumOfRow + ", Row: " + index);
	}
}
