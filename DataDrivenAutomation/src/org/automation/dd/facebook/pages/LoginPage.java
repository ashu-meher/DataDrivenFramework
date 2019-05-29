package org.automation.dd.facebook.pages;

import java.io.IOException;

import org.automation.dd.facebook.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver){
		this.driver=driver;
	}

	public void enterUserName(String UN) throws Exception{
		driver.findElement(By.xpath(Utility.fetchLocatorValue("login_username_xpath"))).clear();
		driver.findElement(By.xpath(Utility.fetchLocatorValue("login_username_xpath"))).sendKeys(UN);
	}
	
	public void enterPassWord(String PW) throws Exception{
		driver.findElement(By.xpath(Utility.fetchLocatorValue("login_password_xpath"))).clear();
		driver.findElement(By.xpath(Utility.fetchLocatorValue("login_password_xpath"))).sendKeys(PW);
	}
	
	public void ClickLoginBtn() throws Exception {
		driver.findElement(By.xpath(Utility.fetchLocatorValue("login_loginbtn_xpath"))).click();
	}
	
	
	public void enterFirstName(String FN ) throws Exception {
		driver.findElement(By.xpath(Utility.fetchLocatorValue("reg_firstname_xpath"))).sendKeys(FN);
	}
	
	public void enterLastName(String LN) throws Exception {
		driver.findElement(By.xpath(Utility.fetchLocatorValue("reg_lastname_xpath"))).sendKeys(LN);
	}
	
	public void enterEmailId(String EID) throws Exception {
		driver.findElement(By.xpath(Utility.fetchLocatorValue("reg_emailid_xpath"))).sendKeys(EID);
	}
	
}



