package com.pragmatic.pageobjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pragmatic.utils.Browser;

public class AdminDeleteUserPage {
	public static void goTo() {
		Browser.instance
				.get("http://shop.pragmatic.bg/admin/index.php?route=user/user");
	}

	public boolean isAt() {
		return Browser.instance.getTitle().equalsIgnoreCase("User");
	}

	public static void withUsername(String string) {
		Browser.instance.findElement(
				By.xpath("//td[contains(text(), '" + string
						+ "')]/preceding-sibling::td")).click();
		Sleeper.sleepTightInSeconds(3);
	}

	public static void delete() {
		Browser.instance.findElement(By.linkText("Delete")).click();
		Sleeper.sleepTightInSeconds(2);

		try {
			Alert alert = Browser.instance.switchTo().alert();
			alert.accept();
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}
	}

	public static boolean isDeleted() {
		return Browser.instance.findElement(By.cssSelector("div.success")).getText().equalsIgnoreCase("Success: You have modified users!");
	}

}
