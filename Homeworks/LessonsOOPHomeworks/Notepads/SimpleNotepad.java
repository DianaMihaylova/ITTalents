package lesson20Homework;

public class SimpleNotepad implements INotepad {
	
	private int pages;
	private Page[] pagesArray;
	
	public SimpleNotepad(int pages) {
		this.setPages(pages);
		this.pagesArray = new Page[this.getPages()];
		for (int i = 0; i < pagesArray.length; i++) {
			pagesArray[i] = new Page();
		}
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		if (pages > 0) {
			this.pages = pages;
		} else {
			this.pages = 10;
		}
	}
	
	public boolean isValidNumOfPage(int numOfPage) {
		return numOfPage > 0 && numOfPage < pagesArray.length;
	}

	@Override
	public void addTextToPage(String text, int numOfPage) {
		if (isValidNumOfPage(numOfPage)) {
			pagesArray[numOfPage].addText(text);
		} else {
			System.out.println("Enter a valid value of text or page!");
		}
	}

	@Override
	public void addTextToDeletedPage(String text, int numOfPage) {
		if (isValidNumOfPage(numOfPage)) {
			pagesArray[numOfPage].deleteText();
			pagesArray[numOfPage].addText(text);
		} else {
			System.out.println("Enter a valid value of text or page!");
		}
	}

	@Override
	public void deleteTextOfPage(int numOfPage) {
		if (isValidNumOfPage(numOfPage)) {
			pagesArray[numOfPage].deleteText();
		} else {
			System.out.println("Enter a valid value of page!");
		}
	}

	@Override
	public void printAllPages() {
		System.out.println("All pages in the pad:");
		if (pagesArray[0] != null) {
			for (int i = 0; i < pagesArray.length; i++) {
				if (pagesArray[i] != null) {
					System.out.println("------------" + i + "------------");
					pagesArray[i].toString();
				} else {
					continue;
				}
			}
		} else {
			System.out.println("The notepad is empty!");
		}
		System.out.println("-------- end --------");
		System.out.println();
	}

	@Override
	public boolean searchWord(String word) {
		boolean isWord = false;
		System.out.println("Searching word: " + word);
		for (int i = 0; i < pagesArray.length; i++) {
			System.out.println("--------" + i + "--------");
			if (pagesArray[i].searchWord(word)) {
				System.out.println();
				isWord = true;
			}
		}
		System.out.println();
		return isWord;
	}

	@Override
	public void printAllPagesWithDigits() {
		System.out.println("Searching digits: ");
		for (int i = 0; i < pagesArray.length; i++) {
			System.out.println("--------" + i + "--------");
			if (pagesArray[i].containsDigits()) {
				pagesArray[i].toString();
			}
		}
		System.out.println();
	}
}
