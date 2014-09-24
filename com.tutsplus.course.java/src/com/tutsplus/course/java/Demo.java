package com.tutsplus.course.java;

public class Demo {

	public static void main(String[] args) {

		// Add books in the library
		Library library = new Library();
		library.createBook("book1");
		library.createBook("book2");
		library.createBook("book3");
		library.createBook("book4");
		library.createBook("book5");

		// Create Persons
		Person person1 = new Person("person1");

		// List all books from the library
		library.listOfBooks();
		System.out.println(" \n" + "------------------------------");

		// Checkout a book
		library.checkoutBook("book3", person1);

		System.out.println(person1.getName()
				+ " is checkouted following book: "
				+ person1.getAssignedBookName());
		library.listOfBooks();

		// Check-in a book
		System.out.println(" \n" + "------------------------------");
		library.checkinBook(person1);
		library.listOfBooks();
	}
}
