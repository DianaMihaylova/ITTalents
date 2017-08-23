package lesson07AdditionalArraysTasks;

import java.util.Arrays;

public class Task10 {

	public static void main(String[] args) {
		
		int[] array = {4, 1, 1, 4, 2, 3,4, 4, 1, 2, 4, 9, 3};
		
		int count = 1;
		int num = 0;
		int sort = 0;
		boolean swapped = true;
		int maxCount = 0;
		
		while (swapped) {
		       swapped = false;
		       for (int i = 0; i < array.length - 1; i++) {
					if (array[i] > array[i + 1]) {
						sort = array[i];
						array[i] = array[i + 1];
						array[i + 1] = sort;
						swapped = true;
					}
				}
		}
		System.out.println(Arrays.toString(array));
		
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == array[i + 1]) {
				count++;
			} else {
				count = 1;
			}
			if (count > maxCount) {
				maxCount = count;
				num = array[i];
			}
		}
		System.out.println("Num: " + num + ", count: " + maxCount);
	}
}
