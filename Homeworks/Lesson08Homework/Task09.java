package lesson08Homework;

public class Task09 {

	public static void main(String[] args) {
		
		String text = "asd-12sdf45-56asdf100";

		int totalSum = 0;
		int tempSum = 0;
		boolean negative = false;
		String negativeNum = "-";
		String positiveNum = "";
		
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) >= '0' && text.charAt(i) <= '9') {
				if (negative) {
					negativeNum += text.charAt(i);
				} else {
					positiveNum += text.charAt(i);
				}
			} else if (text.charAt(i) == '-') {
				negative = true;
			} else {
				if (negative) {
					tempSum = Integer.parseInt(negativeNum);
					totalSum = totalSum + tempSum;
					negativeNum = "-";
				} else if (positiveNum != "") {
					tempSum = Integer.parseInt(positiveNum);
					totalSum += tempSum;
					positiveNum = "";
				}
				negative = false;
			}
		}
		if (negativeNum != "-") {
			tempSum = Integer.parseInt(negativeNum);
			totalSum = totalSum + tempSum;
			negativeNum = "-";
		} else if (positiveNum != "") {
			tempSum = Integer.parseInt(positiveNum);
			totalSum += tempSum;
		}
		System.out.println(totalSum);
	}
}
