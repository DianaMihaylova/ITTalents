package lesson06Homework;

public class Task03 {

	public static void main(String[] args) {
		
		int[][] array = {
				{20,2,34,16},
				{55,22,53,23},
				{31,9,33,34},
				{41,97,43,95},
				{59,3,68,69}
		};
		
		int sum = 0;
		int length = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				sum += array[i][j];
				length++;
			}
		}
		
		double avg = ((double)sum) / length;
		
		System.out.println("The sum of all elements is: " + sum);
		System.out.println("The average of all elements is : " + avg);
	}
}
