package org.automation.dd.facebook.assertion;

import org.openqa.selenium.WebDriver;

public class Compare {
	WebDriver driver;

	public static boolean validatePageUrl(WebDriver driver, String ExtUrl){
		boolean flag=false;
		if(driver.getCurrentUrl().equalsIgnoreCase(ExtUrl)){
			flag=true;
		}
		return flag;
	}
	
	public static boolean validatePageTitle(WebDriver driver, String ExtTitle){
		boolean flag=false;
		if(driver.getTitle().equalsIgnoreCase(ExtTitle)){
			flag=true;
		}
		return flag;
	}
}
