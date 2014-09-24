package com.pragmatic.lesson8.exceptions.playground;

import java.io.File;

import javax.naming.InvalidNameException;

public class ExceptionsExample {
	
	public static void main(String[] args) {
		
		Printer printer = new Printer();
		try {
			printer.print(-1);
		} catch (InvalidNameException e) {
			System.out.println("uuu" + e.getCause());
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		
//		File file = new File("C:\\test.txt");
//		file.createNewFile();
	}

}
