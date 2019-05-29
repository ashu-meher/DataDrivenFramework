package org.automation.dd.facebook.testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.automation.dd.facebook.base.TestBase;
import org.automation.dd.facebook.datagenerator.DataGenerator;
import org.automation.dd.facebook.pages.LoginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_001_ValidateLoginFunctionality extends TestBase{
	
	@Test(dataProvider="Excel", dataProviderClass=DataGenerator.class)
	public void tc_001_login(String uname, String pword) throws Exception{
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName(uname);
		loginpage.enterPassWord(pword);
		loginpage.ClickLoginBtn();
	}
	
	//Use while reading data from program itself
//	@DataProvider(name="Logindata")
//	public Object[][] dataGenerator(){
//		Object [][] data = {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};
//		return data;
//	}

	
	
	
}
