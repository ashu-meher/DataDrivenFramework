package org.automation.dd.facebook.testcases;

import org.automation.dd.facebook.base.TestBase;
import org.automation.dd.facebook.datagenerator.DataGenerator;
import org.automation.dd.facebook.pages.LoginPage;
import org.testng.annotations.Test;

public class TC_002_RegisterForm_FB extends TestBase{
	
	@Test(dataProvider="Register", dataProviderClass=DataGenerator.class)
	public void tc_002_RegForm(String Fname, String Lname, String emid) throws Exception{
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterFirstName(Fname);
		loginpage.enterLastName(Lname);
		loginpage.enterEmailId(emid);
		
	}
	
	

}
