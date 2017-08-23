package lesson20Homework;

public interface INotepad {
	
	public void addTextToPage(String text, int numOfPage);
	public void addTextToDeletedPage(String text, int numOfPage);
	public void deleteTextOfPage(int numOfPage);
	public void printAllPages();
	public boolean searchWord(String word);
	public void printAllPagesWithDigits();
}
