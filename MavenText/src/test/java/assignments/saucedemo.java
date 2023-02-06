package assignments;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class saucedemo {

	public static void main(String[] args) throws InterruptedException {
		SeleniumUtility m1= new SeleniumUtility();
		WebDriver driver= m1.setUp("chrome","https://www.saucedemo.com");
		//First username and password
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div.error")).clear();
		//driver.navigate().back();
		driver.findElement(By.id("user-name")).sendKeys("problem_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		
		


	}

}
