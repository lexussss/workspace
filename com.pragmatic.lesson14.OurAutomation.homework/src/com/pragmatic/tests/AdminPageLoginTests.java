package com.pragmatic.tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.pragmatic.pageobjects.AdminDashoardPage;
import com.pragmatic.pageobjects.AdminLoginPage;
import com.pragmatic.pageobjects.commands.AdminLoginCommands;
import com.pragmatic.pageobjects.enums.Password;
import com.pragmatic.pageobjects.enums.Username;
import com.pragmatic.utils.Browser;

public class AdminPageLoginTests {

	@Before
	public void init(){
		Browser.init();
	}
	
	@Test
	public void unsuccessfulLogin(){
		AdminLoginPage.goTo();
		AdminLoginPage.login("milen", "parola");

		Assert.assertTrue("We don't see validation message for login", AdminLoginPage.isUnsuccessfulLogin());
	}
	
	@Test
	public void successfulLogin(){
		AdminLoginPage.goTo();
		//AdminLoginPage.login("admin", "parola");
		AdminLoginPage.loginAs(Username.ADMIN).withPassword(Password.ADMINPASS).login();
		//AdminLoginPage.loginAs(Username.ADMIN).withPassword(Password.TEACHERPASS).login();
		Assert.assertTrue("We were unable to login", AdminDashoardPage.isAt());
	}
	
	@After
	public void tearDown(){
		Browser.quit();
	}
	
}
