package com.pragmatic.tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.pragmatic.pageobjects.AdminCreateNewUserPage;
import com.pragmatic.pageobjects.AdminLoginPage;
import com.pragmatic.pageobjects.enums.Password;
import com.pragmatic.pageobjects.enums.Username;
import com.pragmatic.utils.Browser;

public class AdminCreateNewUserTests {

	@Before
	public void init() {
		Browser.init();
	}

	@Test
	public void createNewAdminUser() {
		AdminCreateNewUserPage.goTo();
		AdminLoginPage.loginAs(Username.ADMIN).withPassword(Password.ADMINPASS)
				.login();
		Assert.assertTrue("We are not at create User page",
				AdminCreateNewUserPage.isAt());
		
		AdminCreateNewUserPage.withUsername("Test123")
				.withFirstName("Test123")
				.withLastName("Test123")
				.withEmail("Test123@mail.com")
				.withPassword("Test123")
				.withConfirmPassword("Test123")
				.save();
		Assert.assertTrue("We were unable to create a user", AdminCreateNewUserPage.isCreated());
	}

	@After
	public void tearDown() {
		Browser.quit();
	}
}
