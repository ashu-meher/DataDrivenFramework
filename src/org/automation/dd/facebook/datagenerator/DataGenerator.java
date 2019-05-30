package org.automation.dd.facebook.datagenerator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataGenerator {

	@DataProvider(name="Excel")
	public static Object[][] dataGenerator() throws Exception{
		FileInputStream file = new FileInputStream(".//TestData//Fb_DataDriven.xlsx");
		XSSFWorkbook wk = new XSSFWorkbook(file);
		XSSFSheet logindata = wk.getSheet("Login");
		int numberofdata = logindata.getPhysicalNumberOfRows();
		Object [][] testdata = new Object[numberofdata][2];
		
		for(int i=0;i<numberofdata;i++){
			XSSFRow row = logindata.getRow(i);
			XSSFCell username = row.getCell(0);
			XSSFCell password = row.getCell(1);
			testdata[i][0] = username.getStringCellValue();
			testdata[i][1] = password.getStringCellValue();			
		}
		return testdata;
	}
	
	@DataProvider(name="Register")
	public static Object[][] dataGeneratorRegister() throws IOException {
		FileInputStream file = new FileInputStream(".//TestData//Fb_DataDriven.xlsx");
		XSSFWorkbook wk = new XSSFWorkbook(file);
		XSSFSheet logindata = wk.getSheet("RegisterForm");
		int numberofdata = logindata.getPhysicalNumberOfRows();
		Object [][] testdata = new Object[numberofdata][3];
		
		for(int i=0;i<numberofdata;i++){
			XSSFRow row = logindata.getRow(i);
			XSSFCell firstname = row.getCell(0);
			XSSFCell lastname = row.getCell(1);
			XSSFCell emailid = row.getCell(0);
			testdata[i][0] = firstname.getStringCellValue();
			testdata[i][1] = lastname.getStringCellValue();	
			testdata[i][2] = emailid.getStringCellValue();	
		}
		return testdata;
	}
	
}
