package lesson05Homework;

import java.util.Arrays;

public class Task16 {

	public static void main(String[] args) {
		
		double[] array = {-1.12, -2.43, 3.1, 4.2, 0, 6.4, -7.5, 8.6, 9.1, -4};
		
		System.out.println(Arrays.toString(array));
		
		for (int i = 0; i < array.length; i++) {
			int num = i + 1;
			if (array[i] < -0.231) {
				array[i] = (num * num) + 41.25;
			} else {
				array[i] = array[i] * num;
			}
		}
		System.out.println(Arrays.toString(array));
	}
}
