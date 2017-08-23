package lesson20Homework;

public class ElectronicSecuredNotepad extends SecuredNotepad implements IÅlectronicDevice {
	
	private boolean isStarted;

	public ElectronicSecuredNotepad(int pages, String password) {
		super(pages, password);
		this.isStarted = false;
	}

	@Override
	public void start() {
		System.out.println("The device is started!");
		this.isStarted = true;
	}

	@Override
	public void stop() {
		System.out.println("The device is stopped!");
		this.isStarted = false;
	}

	@Override
	public boolean isStarted() {
		return isStarted;
	}

	@Override
	public void addTextToPage(String text, int numOfPage) {
		if (isStarted()) {
			super.addTextToPage(text, numOfPage);
		} else {
			System.out.println("The device is not started!");
		}
	}

	@Override
	public void addTextToDeletedPage(String text, int numOfPage) {
		if (isStarted()) {
			super.addTextToDeletedPage(text, numOfPage);
		} else {
			System.out.println("The device is not started!");
		}	
	}

	@Override
	public void deleteTextOfPage(int numOfPage) {
		if (isStarted()) {
			super.deleteTextOfPage(numOfPage);
		} else {
			System.out.println("The device is not started!");
		}	
	}

	@Override
	public void printAllPages() {
		if (isStarted()) {
			super.printAllPages();
		} else {
			System.out.println("The device is not started!");
		}	
	}

	@Override
	public boolean searchWord(String word) {
		if (isStarted()) {
			return super.searchWord(word);
		}
		System.out.println("The device is not started!");
		return false;
	}

	@Override
	public void printAllPagesWithDigits() {
		if (isStarted()) {
			super.printAllPagesWithDigits();
		} else {
			System.out.println("The device is not started!");
		}
	}
}
