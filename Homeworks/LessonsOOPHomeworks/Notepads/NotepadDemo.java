package lesson20Homework;

public class NotepadDemo {

	public static void main(String[] args) {
		
		SimpleNotepad notepad = new SimpleNotepad(10);
		
		notepad.addTextToPage("Hello", 3);
		notepad.addTextToPage("Some text", 6);
		notepad.addTextToPage("Some other text", 9);
		
		notepad.addTextToDeletedPage("Text2", 3);
		
		notepad.deleteTextOfPage(6);
		
		notepad.printAllPages();
		
		notepad.searchWord("Some");
		
		notepad.printAllPagesWithDigits();
		
		INotepad notepadTwo = new SimpleNotepad(20);
		
		notepadTwo.addTextToPage("Some text", 9);
		
		notepadTwo.deleteTextOfPage(9);
		
		SecuredNotepad securedNotepad = null;
		
		try {
			securedNotepad = new SecuredNotepad(12, "grd9H");
		} catch (IllegalArgumentException e) {
			System.out.println("The password is not strong! The secured notepad is not created!");
		}
		
		if (securedNotepad == null) {
			return;
		} else {
			securedNotepad.addTextToPage("Some another text", 5);
			securedNotepad.addTextToPage("Some text 2", 10);
			securedNotepad.addTextToPage("Another text3", 8);
			
			securedNotepad.addTextToDeletedPage("Hello", 10);
			
			securedNotepad.deleteTextOfPage(8);
			
			securedNotepad.printAllPages();
			
			securedNotepad.searchWord("Hello");
			
			securedNotepad.printAllPagesWithDigits();
		}
		
		ElectronicSecuredNotepad electronicPad = null;
		
		try {
			electronicPad = new ElectronicSecuredNotepad(19, "ghT6hg");
		} catch (IllegalArgumentException e) {
			System.out.println("The password is not strong! The electronic secured notepad is not created!");
		}
		
		if (electronicPad == null) {
			return;
		} else {
			electronicPad.start();
			
			electronicPad.addTextToPage("Text1", 3);
			electronicPad.addTextToPage("Text9", 6);
			electronicPad.addTextToPage("Another page text", 12);
			
			electronicPad.addTextToDeletedPage("Some page text", 3);
			
			electronicPad.deleteTextOfPage(6);
			
			electronicPad.printAllPages();
			
			electronicPad.searchWord("page");
			
			electronicPad.printAllPagesWithDigits();
		}
	}
}
