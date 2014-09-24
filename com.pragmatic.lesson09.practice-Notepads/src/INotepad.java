
public interface INotepad {
	void writeOnNewPage(int pageNumber, String title, String text);
	
	void replaceText(int pageNumber, String text);
	
	void removeText(int pageNumber);
	
	void displayPages();
}
