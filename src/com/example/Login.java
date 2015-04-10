package com.example;

import com.thoughtworks.selenium.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

public class Login {
	@SuppressWarnings("deprecation")
	private Selenium selenium;

	// @Before
	@SuppressWarnings("deprecation")
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "https://dr-spark-staging.herokuapp.com/");
		selenium.start();
	}

	// @Test
	public void testLogin() throws Exception {
		selenium.open("/discover");
		selenium.click("link=Login");
		selenium.type("id=username", "qaautomation");
		selenium.type("id=password", "3^testtest");
		selenium.click("css=button.Login-btn.ts-login-button");
		selenium.waitForPageToLoad("150000");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=qaautomation")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=qaautomation");
		selenium.click("link=Logout");
	}

	// @After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
