package lesson20Homework;

public class Page {
	
	private String title;
	private String text;
	
	public Page() {
		this.title = "";
		this.text = "";
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		if (title != null && title != "") {
			this.title = title;
		} else {
			System.out.println("Enter a valid title!");
			return;
		}	
	}
	
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		if (text != null && text != "") {
			this.text = text;
		} else {
			System.out.println("Enter a valid text!");
		}
	}
	
	public void addText(String text) {
		this.setText(this.text + text);
	}
	
	public void deleteText() {
		this.text = "";
	}
	
	public boolean searchWord(String word) {
		boolean search = false;
		int searchWord = this.text.indexOf(word);
		if (searchWord != -1) {
			search = true;
		}
		System.out.println("The word is contained in the text: " + search);
		return search;
	}
	
	public boolean containsDigits() {
		boolean contain = false;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) >= '0' && text.charAt(i) <= '9') {
				contain = true;
			}
		}
		System.out.println("The num is contained in the text: " + contain);
		return contain;
	}

	@Override
	public String toString() {
		String result = this.title + "\n" + this.text;
		System.out.println(result);
		return result;
	}
}
