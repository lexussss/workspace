package com.pragmatic.lesson8.exceptions;

public class ChainedExceptionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = null;
		testMethod(str);
	}
	
	private static void testMethod(String str) {
		try {
			int length = str.length();
			System.out.println(length);
		} catch (NullPointerException npe) {
			throw new RuntimeException("The string value is null", npe);
		}
	}
}
