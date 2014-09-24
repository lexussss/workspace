package com.pragmatic.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.pragmatic.pageobjects.commands.AdminLoginCommands;
import com.pragmatic.pageobjects.enums.Username;
import com.pragmatic.utils.Browser;

public class AdminLoginPage {

	public static void goTo() {
		Browser.instance.get("http://shop.pragmatic.bg/admin");
	}

	public static void login(String username, String password) {
		Browser.instance.findElement(By.name("username")).sendKeys(username);
		Browser.instance.findElement(By.name("password")).sendKeys(password);
		Browser.instance.findElement(By.linkText("Login")).click();
	}

	public static boolean isUnsuccessfulLogin() {
		WebElement validationMessage = Browser.instance.findElement(By
				.className("warning"));
		return validationMessage.getText().trim()
				.equalsIgnoreCase("No match for Username and/or Password.");
	}

	public static AdminLoginCommands loginAs(Username username) {
		return new AdminLoginCommands(username);
	}
}