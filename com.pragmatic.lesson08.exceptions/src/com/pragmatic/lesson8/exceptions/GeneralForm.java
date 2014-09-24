package com.pragmatic.lesson8.exceptions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeneralForm {

	public void throwNewCustomException() throws CustomException {
		System.out.println("Prava neshto predi throw-a");
		throw new CustomException();
	}
	
	public void throwNewIOException() throws IOException {
		
	}
	
	public void throwNewIllegalArgumentException() throws IllegalArgumentException {
		throw new IllegalArgumentException();
	}
	
	public static void main(String[] args) {
		GeneralForm _this = new GeneralForm();
		
		try {
			_this.throwNewCustomException();
			_this.throwNewIllegalArgumentException(); // this is a runtime exception
			_this.throwNewIOException();
		} catch (CustomException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// handle exception here
		} catch (IllegalArgumentException e ){
			e.printStackTrace();
		}finally{
			System.out.println("This is always performed");
		}
		
	}
	
}
