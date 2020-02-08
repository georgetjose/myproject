package com.uipath.basetestng;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;


import com.uipath.base.SeleniumBase;
import com.uipath.utils.ExcelHandler;


public class ProjectSpecificMethods extends SeleniumBase {

	public String dataSheetName;		

	@DataProvider(name = "fetchData")
	public Object[][] fetchData() throws IOException {
		return ExcelHandler.readExcelData(dataSheetName);
	}	

	@BeforeMethod
	public void beforeMethod() {
		driver = startApp("https://acme-test.uipath.com/account/login");
		node = test.createNode(testCaseName);
	}

	@AfterMethod
	public void afterMethod() {
		close();
	}













}
