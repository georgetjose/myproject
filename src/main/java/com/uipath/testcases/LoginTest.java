package com.uipath.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.uipath.basetestng.ProjectSpecificMethods;
import com.uipath.pages.LoginPage;


public class LoginTest extends ProjectSpecificMethods
{
	@BeforeTest
	public void setValues() {
		testCaseName = "Login and LoginOut";
		testDescription = "Login testCase";
		nodes = "UIPath";
		authors = "George";
		category = "Smoke";
	}
	@Test
	public void myTest() throws InterruptedException
	{
		new LoginPage(driver, node, test)
		.enterUsername()
		.enterPassword()
		.clickLogin()
		.verifyPageTitle();
	}
}
