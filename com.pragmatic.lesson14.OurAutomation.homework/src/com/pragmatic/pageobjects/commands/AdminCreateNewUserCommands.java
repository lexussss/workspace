package com.pragmatic.pageobjects.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.pragmatic.utils.Browser;

public class AdminCreateNewUserCommands {
	private String username;
	private String firstname;
	private String lastname;
	private String email;
//	private Select userGroup;
	private String password;
	private String confirmPassword;
//	private Select status;
	

	public AdminCreateNewUserCommands(String username) {
		this.username = username;
	}

	public AdminCreateNewUserCommands withFirstName (String firstname) {
		this.firstname = firstname;
		return this;
	}
	
	public AdminCreateNewUserCommands withLastName (String lastname) {
		this.lastname = lastname;
		return this;
	}
	
	public AdminCreateNewUserCommands withEmail (String email) {
		this.email = email;
		return this;
	}
	
//	public AdminCreateNewUserCommands withUserGroup (Select userGroup) {
//		this.userGroup = userGroup;
//		return this;
//	}
	
	public AdminCreateNewUserCommands withPassword (String password) {
		this.password = password;
		return this;
	}
	
	public AdminCreateNewUserCommands withConfirmPassword (String confirmPassword) {
		this.confirmPassword = confirmPassword;
		return this;
	}
	
//	public AdminCreateNewUserCommands withStatus (Select status) {
//		this.status = status;
//		return this;
//	}

	public void save() {
		Browser.instance.findElement(By.name("username")).sendKeys(this.username);
		Browser.instance.findElement(By.name("firstname")).sendKeys(this.firstname);
		Browser.instance.findElement(By.name("lastname")).sendKeys(this.lastname);
		Browser.instance.findElement(By.name("email")).sendKeys(this.email);
//		Browser.instance.findElement(By.name("user_group_id")).sendKeys(this.);
		Browser.instance.findElement(By.name("password")).sendKeys(this.password);
		Browser.instance.findElement(By.name("confirm")).sendKeys(this.confirmPassword);
//		Browser.instance.findElement(By.name("")).sendKeys(this.);
		Browser.instance.findElement(By.linkText("Save")).click();
	}
}
