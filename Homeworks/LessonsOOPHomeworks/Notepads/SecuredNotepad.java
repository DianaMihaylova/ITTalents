package lesson20Homework;

import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad {

	private final Scanner sc = new Scanner(System.in);
	private String password;

	public SecuredNotepad(int pages, String password) {
		super(pages);
		if (isStrongPass(password)) {
			this.password = password;
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	public boolean isStrongPass(String password) {
		boolean result = false;
		boolean lenghtPass = false;
		boolean hasDigit = false;
		boolean hasCapitalLetter = false;
		boolean hasSmallLetter = false;
		if (password != null && password != "" && password.length() >= 5) {
			lenghtPass = true;
			for (int i = 0; i < password.length(); i++) {
				if (password.charAt(i) >= '1' && password.charAt(i) <= '9') {
					hasDigit = true;
				}
				if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z') {
					hasSmallLetter = true;
				}
				if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
					hasCapitalLetter = true;
				}
			}
		} else {
			System.out.println("Enter a valid value for password!");
		}
		if (!hasDigit) {
			System.out.println("The pass have to contain digit!");
		}
		if (!hasCapitalLetter) {
			System.out.println("The pass have to contain capital letter");
		}
		if (!hasSmallLetter) {
			System.out.println("The pass have to contain small letter");
		}
		if (lenghtPass && hasCapitalLetter && hasDigit && hasSmallLetter) {
			result = true;
		}
		return result;
	}
	
	public boolean isCorrectPassword() {
		boolean correctPass = false;
		System.out.println("Enter a password:");
		String pass = sc.nextLine();
		if (pass.equals(this.password)) {
			correctPass = true;
		} else {
			System.out.println("The password is not correct!");
		}
		return correctPass;
	}

	@Override
	public void addTextToPage(String text, int numOfPage) {
		if (isCorrectPassword()) {
			super.addTextToPage(text, numOfPage);
		}
	}

	@Override
	public void addTextToDeletedPage(String text, int numOfPage) {
		if (isCorrectPassword()) {
			super.addTextToDeletedPage(text, numOfPage);
		}
	}

	@Override
	public void deleteTextOfPage(int numOfPage) {
		if (isCorrectPassword()) {
			super.deleteTextOfPage(numOfPage);
		}		
	}

	@Override
	public void printAllPages() {
		if (isCorrectPassword()) {
			super.printAllPages();
		}		
	}
	
	@Override
	public boolean searchWord(String word) {
		if (isCorrectPassword()) {
			return super.searchWord(word);
		}
		return false;
	}

	@Override
	public void printAllPagesWithDigits() {
		if (isCorrectPassword()) {
			super.printAllPagesWithDigits();
		}
	}
}
