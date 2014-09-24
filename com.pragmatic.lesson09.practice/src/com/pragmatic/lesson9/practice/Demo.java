package com.pragmatic.lesson9.practice;

public class Demo {
	public static void main(String[] args) {
		
		//Demo of SimpleNotepad
		SimpleNotepad mySimpleNotepad = new SimpleNotepad();
		mySimpleNotepad.writeOnNewPage(1, "Zaglavie", "Tekst pod zaglavie1");
		mySimpleNotepad.writeOnNewPage(2, "Zaglavie2", "Tekst pod zaglavie2");
		mySimpleNotepad.removeText(2);
		mySimpleNotepad.replaceTextOnPage(1, "replace-nat");
		mySimpleNotepad.displayPages();
		
//		//Demo of secureNotepad
//		INotepad secureNotepad = new SecuredNotepad("pass123");
//		secureNotepad.writeOnNewPage(1, "Title", "Text");
//		secureNotepad.displayPages();
//	
//		
//		//Demo of ElectronicSecuredNotepad
//		ElectronicSecuredNotepad myElectronicSecuredNotepad = new ElectronicSecuredNotepad("123456");
//		myElectronicSecuredNotepad.start();
//		myElectronicSecuredNotepad.writeOnNewPage(1, "Title on p.1", "Text on p.1");
//		myElectronicSecuredNotepad.writeOnNewPage(2, "Title on p.2", "Text on p.2");
//		myElectronicSecuredNotepad.displayPages();
//		myElectronicSecuredNotepad.removeText(2);
//		myElectronicSecuredNotepad.replaceTextOnPage(2, "New text on p.2");
//		myElectronicSecuredNotepad.displayPages();

	}
}