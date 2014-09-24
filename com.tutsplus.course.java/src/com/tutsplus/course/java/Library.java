package com.tutsplus.course.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Library {

	List<Book> books;

	public Library() {
		this.books = new ArrayList<>();
	}

	public void createBook(String bookName) {
		Book book = new Book();
		book.setBookName(bookName);
		this.books.add(book);
	}

	public void listOfBooks() {
		Iterator<Book> iter = this.books.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next().getBookName() + ", ");
		}
	}
	
	public void checkoutBook(String bookName, Person person) {
		for (Book book : this.books) {
			if (book.getBookName() == bookName) {
				book.checkout();
				person.assignBook(book);
				
			}
		}

	}
	
	public void checkinBook(Person person){
		person.getAssignedBook().checkin();
		person.checkinAssignedBook();
	}
	
}