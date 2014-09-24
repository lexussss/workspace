package com.tutsplus.course.java;

public class Person {
	private String name;
	private Book assignedBook;

	public Person(String name) {
		this.name = name;
	}

	public String getAssignedBookName() {
		return assignedBook.readBookName();
	}

	public Book getAssignedBook() {
		return assignedBook;
	}

	public void checkinAssignedBook() {
		this.assignedBook = null;
	}

	public String getName() {
		return this.name;
	}

	public void assignBook(Book bookName) {
		this.assignedBook = bookName;
	}
}
