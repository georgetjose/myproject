package com.uipath.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.uipath.basetestng.ProjectSpecificMethods;
import com.uipath.pages.HomePage;

public class HomePage extends ProjectSpecificMethods
{
	public HomePage(RemoteWebDriver driver, ExtentTest node, ExtentTest test){
		this.driver = driver;
		this.node = node;
		this.test = test;
	}
	
	public HomePage verifyPageTitle()
	{
		verifyTitle("ACME System 1 - Dashboard");
		return this;
	}
	
}
