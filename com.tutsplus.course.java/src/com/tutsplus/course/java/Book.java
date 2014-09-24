package com.tutsplus.course.java;

public class Book {

	private String bookName;
	private Boolean isCheckouted = false;

	public String getBookName() {
		if (this.isCheckouted == false) {
			return this.bookName;
		} else {
			String a = "";
			return a;
		}
	}

	public String readBookName() {
		return this.bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public void checkout() {
		this.isCheckouted = true;
	}

	public void checkin() {
		this.isCheckouted = false;
	}
}
