package lesson07AdditionalArraysTasks;

public class Task01 {

	public static void main(String[] args) {
		
		int[] array = {1,-5,6,9,2,3};
		
		boolean check = false;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				check = true;
				break;
			}
		}
		System.out.println("Array have a negative numbers: " + check);
	}
}
