package com.pragmatic.lesson9.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SimpleNotepad implements INotepad {

	List<Page> pages;

	public List<Page> getPages() {
		return pages;
	}

	public SimpleNotepad() {
		this.pages = new ArrayList<>();
	}

	@Override
	public void writeOnNewPage(int pageNumebr, String title, String text) {
		Page page = new Page();
		page.addText(title, text);
		page.setPageNumber(pageNumebr);
		this.pages.add(page);
	}

	@Override
	// with for each
	public void replaceTextOnPage(int pageNumber, String text) {
		for (Page page : this.pages) {
			if (page.getPageNumber() == pageNumber) {
				page.changeText(text);
			}
		}

	}

	@Override
	// - with Iterator
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
