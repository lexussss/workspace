package com.pragmatic.pageobjects;

import org.openqa.selenium.By;

import com.pragmatic.pageobjects.commands.AdminCreateNewUserCommands;
import com.pragmatic.utils.Browser;

public class AdminCreateNewUserPage {
	
	public static void goTo() {
		Browser.instance.get("http://shop.pragmatic.bg/admin/index.php?route=user/user/insert");
	}

	public static boolean isAt() {
		return Browser.instance.getTitle().equalsIgnoreCase("User");
	}
	
	public static AdminCreateNewUserCommands withUsername(String username) {
		return new AdminCreateNewUserCommands(username);
	}

	public static boolean isCreated() {
		return Browser.instance.findElement(By.cssSelector("div.success")).getText().equalsIgnoreCase("Success: You have modified users!");
	}
	
	
}
