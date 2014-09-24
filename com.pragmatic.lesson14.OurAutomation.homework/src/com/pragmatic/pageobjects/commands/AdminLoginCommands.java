package com.pragmatic.pageobjects.commands;

import org.openqa.selenium.By;

import com.pragmatic.pageobjects.enums.Password;
import com.pragmatic.pageobjects.enums.Username;
import com.pragmatic.utils.Browser;

public class AdminLoginCommands {
	
	private String username;
	private String password;
	
	public AdminLoginCommands(Username username) {
		this.username = username.getUsername();
	}

	public AdminLoginCommands withPassword(Password password) {
		this.password = password.getPassword();
		return this;
	}

	public void login() {
		Browser.instance.findElement(By.name("username")).sendKeys(this.username);
		Browser.instance.findElement(By.name("password")).sendKeys(this.password);
		Browser.instance.findElement(By.linkText("Login")).click();
	}

}
