package com.pragmatic.lesson9.myNotepad;

public class Demo {

	public static void main(String[] args) {
		Page myPage = new Page();
		myPage.addText("Title on myPage", "Text on MyPage");
		System.out.println(myPage.viewPage());
		
	}

}
