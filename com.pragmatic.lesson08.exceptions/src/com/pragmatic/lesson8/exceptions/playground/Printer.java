package com.pragmatic.lesson8.exceptions.playground;

import javax.naming.InvalidNameException;


public class Printer {
	
	public void print(int page) throws InvalidNameException {
		checkPageNumber(page);
		
		System.out.println("Printing page: " + page);
		
		
	}

	private void checkPageNumber(int page) throws InvalidNameException {
		if(page < 0){
			throw new InvalidNameException("We cannot print negative page");
		}
	}
}
