package com.pragmatic.lesson9.practice;

import java.util.List;
import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad {
	private String password;

	protected SecuredNotepad(String password) {
		this.password = password;
	}

	@Override
	public List<Page> getPages() {
		return super.getPages();
	}

	@Override
	public void writeOnNewPage(int pageNumebr, String title, String text) {
		if (checkPassword() == true) {
			super.writeOnNewPage(pageNumebr, title, text);
		}
	}

	private boolean checkPassword() {
		System.out.println("Enter password");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			String enteredPassword = sc.nextLine();
			if (enteredPassword.equals(this.password)) {
				System.out.println("Correct");
				return true;
			} else {
				System.out.println("False. Enter password again: ");
			}
		}
		return false;
	}

	@Override
	public void replaceTextOnPage(int pageNumber, String text) {
		if (checkPassword() == true) {
			super.replaceTextOnPage(pageNumber, text);
		}
	}

	@Override
	public void removeText(int pageNumber) {
		if (checkPassword() == true) {
			super.removeText(pageNumber);
		}
	}

	@Override
	public void displayPages() {
		if (checkPassword() == true) {
			super.displayPages();
		}
	}

}
