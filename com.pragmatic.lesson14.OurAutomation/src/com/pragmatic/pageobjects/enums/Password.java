package com.pragmatic.pageobjects.enums;

public enum Password {
	ADMINPASS("barola"), REGULARUSERPASS("nqkava"), TEACHERPASS("teacherparola");
	
	private String password;
	
	public String getPassword() {
		return password;
	}

	private Password(String password){
		this.password = password;
	}

}
