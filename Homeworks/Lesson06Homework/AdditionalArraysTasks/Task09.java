package lesson07AdditionalArraysTasks;

import java.util.Arrays;

public class Task09 {

	public static void main(String[] args) {
		
		int[][] array = {
				{3,5,6,8,9},
				{7,4,6,2,9},
				{9,5,6,69,9},
				{1,8,6,20,9},
		};
		
		int maxSum = 0;
		int[][] maxArr = new int[2][2];
		int sumArr2x2 = 0;
		
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array[0].length - 1; j++) {
				sumArr2x2 = array[i][j] + array[i][j + 1] + array[i + 1][j] + array[i + 1][j + 1];
				if (sumArr2x2 > maxSum) {
					maxSum = sumArr2x2;
					maxArr[0][0] = array[i][j];
					maxArr[0][1] = array[i][j + 1];
					maxArr[1][0] = array[i + 1][j];
					maxArr[1][1] = array[i + 1][j + 1];
				}
			}
		}
		System.out.println(Arrays.deepToString(maxArr));
		System.out.println("Max sum: " + maxSum);
	}
}
