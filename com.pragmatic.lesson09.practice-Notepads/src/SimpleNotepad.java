import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SimpleNotepad implements INotepad, IVeryCoolNotepad {

	List<Page> pages;

	public SimpleNotepad() {
		this.pages = new ArrayList<>();
	}

	@Override
	public void makeMyNotepadBlinkBlink() {
		System.out.println("Blink Blink");
	}

	@Override
	public void writeOnNewPage(int pageNumber, String title, String text) {
		Page page = new Page();
		page.addText(title, text);
		page.setPageNumber(pageNumber);
		this.pages.add(page);
	}

	@Override
	public void replaceText(int pageNumber, String text) {
		Iterator<Page> iter = this.pages.iterator();
		while (iter.hasNext()) {
			Page curPage = iter.next();
			if (curPage.getPageNumber() == pageNumber) {
				curPage.changeText(text);
			}
		}

	}

	@Override
	public void removeText(int pageNumber) {
		Iterator<Page> iter = this.pages.iterator();
		while (iter.hasNext()) {
			Page curPage = iter.next();
			if (curPage.getPageNumber() == pageNumber) {
				curPage.removeText();
			}
		}
	}

	@Override
	public void displayPages() {
		Iterator<Page> iter = this.pages.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next().readPageText());
		}
	}

}
