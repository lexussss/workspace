
public class Demo {
	public static void main(String[] args) {
		INotepad securedNotepad = new SecuredNotepad("pass123");
		securedNotepad.writeOnNewPage(1, "title", "text");
		securedNotepad.displayPages();
//		INotepad mySimpleNotepad = new SimpleNotepad();
//		mySimpleNotepad.writeOnNewPage(1, "Zaglavie1", "Teksta pod zaglavie1");
//		mySimpleNotepad.writeOnNewPage(2, "Zaglavie2", "Teksta pod zaglavie2");
//		mySimpleNotepad.writeOnNewPage(3, "Zaglavie3", "Teksta pod zaglavie3");
//		mySimpleNotepad.writeOnNewPage(-5, "Zaglavie4", "Teksta pod zaglavie4");
//		mySimpleNotepad.removeText(3);
//		mySimpleNotepad.makeMyNotepadBlinkBlink();
//		mySimpleNotepad.replaceText(2, "Replace-nat na 2-ra");
//		mySimpleNotepad.displayPages();
	
	}
}
