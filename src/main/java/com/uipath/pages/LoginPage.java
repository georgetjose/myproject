package com.uipath.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.uipath.basetestng.ProjectSpecificMethods;
import com.uipath.pages.LoginPage;

public class LoginPage extends ProjectSpecificMethods
{
	public LoginPage(RemoteWebDriver driver, ExtentTest node, ExtentTest test){
		this.driver = driver;
		this.node = node;
		this.test = test;
	}
	
	public LoginPage enterUsername()
	{
		clearAndType(locateElement("email"),"kumar.testleaf@gmail.com");
		return this;
	}
	
	public LoginPage enterPassword()
	{
		clearAndType(locateElement("password"),"leaf@12");
		return this;
	}
	
	public HomePage clickLogin() throws InterruptedException
	{
		click(locateElement("buttonLogin"));
		Thread.sleep(5000);
		return new HomePage(driver,node,test);
	}
}
