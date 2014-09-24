package com.pragmatic.lesson8.exceptions.trycatch;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TryCatchFileNotFound {

	public void fileAccess() {
		try {
			FileReader file = new FileReader("Test");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Do something else");
		}
	}
	
	public static void main(String[] args) {
		TryCatchFileNotFound test = new TryCatchFileNotFound();
		test.fileAccess();
	}
	
}
