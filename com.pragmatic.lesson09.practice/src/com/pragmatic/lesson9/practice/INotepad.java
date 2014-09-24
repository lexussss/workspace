package com.pragmatic.lesson9.practice;

public interface INotepad {
	void writeOnNewPage(int pageNumebr, String title, String text);
	
	void replaceTextOnPage(int pageNumber, String text);
	
	void removeText(int pageNumber);
	
	void displayPages();
}
