package com.pragmatic.lesson9.practice;

import java.util.List;

public class ElectronicSecuredNotepad extends SecuredNotepad implements
		IElectroniDevice {

	boolean isStarted = false;

	private boolean isOn() {
		if (isStarted == false) {
			System.out.println("ElectronicSecuredNotepad is OFF");
			return false;
		} else {
			System.out.println("ElectronicSecuredNotepad is ON");
			return true;
		}
	}

	@Override
	public List<Page> getPages() {
		// TODO Auto-generated method stub
		return super.getPages();
	}

	@Override
	public void writeOnNewPage(int pageNumebr, String title, String text) {
		if (isStarted == true) {
			super.writeOnNewPage(pageNumebr, title, text);
		} else {
			System.out.println("ElectronicSecuredNotepad is OFF");
		}
	}

	@Override
	public void replaceTextOnPage(int pageNumber, String text) {
		if (isStarted == true) {
			super.replaceTextOnPage(pageNumber, text);
		} else {
			System.out.println("ElectronicSecuredNotepad is OFF");
		}
	}

	@Override
	public void removeText(int pageNumber) {
		if (isStarted == true) {
			super.removeText(pageNumber);
		} else {
			System.out.println("ElectronicSecuredNotepad is OFF");
		}
	}

	@Override
	public void displayPages() {
		if (isStarted == true) {
			super.displayPages();
		} else {
			System.out.println("ElectronicSecuredNotepad is OFF");
		}
	}

	@Override
	public void start() {
		this.isStarted = true;
	}

	@Override
	public void stop() {
		this.isStarted = false;

	}

	public ElectronicSecuredNotepad(String password) {
		super(password);
	}

}
