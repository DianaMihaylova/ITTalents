package lesson06Homework;

public class Task05 {

	public static void main(String[] args) {
		
		int[][] array = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		
		int sumOfRow = 0;
		int sumOfCol = 0;
		int rowSum = 0;
		int colSum = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				rowSum += array[i][j];
				colSum += array[j][i];
				if (sumOfRow < rowSum) {
					sumOfRow = rowSum;
				}
				if (sumOfCol < colSum) {
					sumOfCol = colSum;
				}
			}
			rowSum = 0;
			colSum = 0;
		}
		
		System.out.println("Max sum of rows: " + sumOfRow);
		System.out.println("Max sum of cols: " + sumOfCol);
		
		if (sumOfRow > sumOfCol) {
			System.out.println("Max sum of rows > max sum of cols");
		} else {
			System.out.println("Max sum of rows < max sum of cols");
		}
	}
}
