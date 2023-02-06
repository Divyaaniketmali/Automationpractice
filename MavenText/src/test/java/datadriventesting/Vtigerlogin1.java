package datadriventesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.ExcelUtility;
import utilities.SeleniumUtility;

public class Vtigerlogin1 extends SeleniumUtility {

	String appUrl;
	String userName;
	String password;	
	@BeforeTest
	public void getData() {
		appUrl=ExcelUtility.getCellValue(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "Sheet1", 3, 0);
		userName=ExcelUtility.getCellValue(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "Sheet1", 3, 1);
		password=ExcelUtility.getCellValue(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "Sheet1", 3, 2);
	}
	@Test
	public void vtigerLogin() {
			WebDriver driver=setUp("chrome", appUrl);			
			typeInput(driver.findElement(By.id("username")),userName);
			typeInput(driver.findElement(By.id("password")),password);
			performClick(driver.findElement(By.className("buttonBlue")));	
			if(getPageTitle("vtiger").equals("vtiger")) {
				ExcelUtility.updateExcelContent(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "Sheet1", 3, 3,"Passed");
			}else {
				ExcelUtility.updateExcelContent(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "Sheet1", 3, 3,"Failed");
			}
			Assert.assertEquals(getPageTitle("vtiger"), "vtiger");
	}
	@AfterTest
	public void cleanUp() {		
		tearDown();
	}
	
		
	}


