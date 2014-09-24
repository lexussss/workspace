package com.pragmatic.pageobjects.enums;

public enum Username {
	ADMIN("admin"), REGULARUSER("milen"), TEACHER("teacheruser");
	
	private String username;
	
	public String getUsername() {
		return username;
	}

	private Username(String username){
		this.username = username;
	}
}
