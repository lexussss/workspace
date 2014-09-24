package com.pragmatic.lesson9.practice;

public class Page {

	private String title = "";
	private String text = "";
	private int pageNumber;

	public void setPageNumber(int pageNumber) {
		if (pageNumber < 0) {
			System.out.println("Imash page numer < 0");
		} else {
			this.pageNumber = pageNumber;
		}
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void addText(String title, String text) {
		this.text += text;
		this.title += title;
	}

	public void removeText() {
		this.text = "";
	}

	public void changeText(String text){
		this.text = text;
	}
	
	public String readPageText() {
		return this.title + " \n" + this.text;
	}
}