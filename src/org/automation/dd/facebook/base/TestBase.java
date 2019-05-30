package org.automation.dd.facebook.base;

import java.io.IOException;
import org.automation.dd.facebook.utility.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class TestBase {

	public WebDriver driver;
	
	@BeforeMethod
	public void initiateDriverInstance() throws Exception{
		
		if(Utility.fetchPropertyValue("browser").toString().equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(Utility.fetchPropertyValue("browser").toString().equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.geckodriver.driver", "C:\\Automation\\Drivers\\geckodriver.exe");
			driver = new ChromeDriver();
		}
		else {
			System.out.println("No Broswer Present");
		}

		driver.get(Utility.fetchPropertyValue("url").toString());
		driver.manage().window().maximize();
		
		
		
	}
	
	@AfterMethod
	public void closeDriverInstance(){
		driver.quit();
	}
	
	
}
