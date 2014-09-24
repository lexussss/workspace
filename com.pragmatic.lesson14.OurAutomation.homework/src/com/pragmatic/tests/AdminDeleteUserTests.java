package com.pragmatic.tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.pragmatic.pageobjects.AdminCreateNewUserPage;
import com.pragmatic.pageobjects.AdminDeleteUserPage;
import com.pragmatic.pageobjects.AdminLoginPage;
import com.pragmatic.pageobjects.enums.Password;
import com.pragmatic.pageobjects.enums.Username;
import com.pragmatic.utils.Browser;

public class AdminDeleteUserTests {

	@Before
	public void init() {
		Browser.init();
	}

	@Test
	public void deleteUserTest() {
		AdminDeleteUserPage.goTo();
		AdminLoginPage.loginAs(Username.ADMIN).withPassword(Password.ADMINPASS)
				.login();
		Assert.assertTrue("We are not at create User page",
				AdminCreateNewUserPage.isAt());

		AdminDeleteUserPage.withUsername("Test123");
		AdminDeleteUserPage.delete();
		Assert.assertTrue("We were unable to delete the user", AdminDeleteUserPage.isDeleted());
	}

	@After
	public void tearDown() {
		Browser.quit();
	}
}
