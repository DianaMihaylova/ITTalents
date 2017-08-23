package lesson07AdditionalArraysTasks;

public class Task04 {

	public static void main(String[] args) {
		
		int[] array = {0,1,1,0,1,0,1,1};
		
		int countZero = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				countZero++;
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			if (countZero > 0) {
				System.out.print(0);
			} else {
				System.out.print(1);
			}
			countZero--;
		}
	}
}
