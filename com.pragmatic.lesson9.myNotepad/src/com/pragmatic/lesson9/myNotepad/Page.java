package com.pragmatic.lesson9.myNotepad;

public class Page {
	
	private String title;
	private String text;
		
	void addText (String title, String text){
		this.title = title;
		this.text = text;
	}
	
	void deleteText(){
		this.text = "";
	}
	
	String viewPage(){
		return (this.title + "\n" + this.text);
		
	}
	
}
