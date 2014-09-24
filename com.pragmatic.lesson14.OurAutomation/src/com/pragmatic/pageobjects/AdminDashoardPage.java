package com.pragmatic.pageobjects;

import com.pragmatic.utils.Browser;

public class AdminDashoardPage {

	public static boolean isAt() {
		return Browser.instance.getTitle().equalsIgnoreCase("Dashboard");
	}

}
