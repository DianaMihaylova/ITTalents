package lesson07AdditionalArraysTasks;

public class Task08 {

	public static void main(String[] args) {
		
		boolean[][] array = {
				{false,true,false,false},
				{true,false,true,true},
				{false,true,true,false},
				{true,false,true,true}
		};
		
		boolean check = false;
		int length = array.length - 1;
		
		
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < length; j++) {
				if (array[i][j] == true) {
					check = true;
				}
				length--;
			}
		}
		System.out.println("It have true: " + check);
	}
}
