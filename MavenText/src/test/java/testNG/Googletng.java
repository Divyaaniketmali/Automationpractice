package testNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class Googletng extends SeleniumUtility {
	@Test
	public void Google() {
		setUp("chrome", "https://www.google.com");
		ChromeDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com");
		driver.getCurrentUrl();
		System.out.println("Page url is: " + driver.getCurrentUrl());
		String sourceCode = driver.getPageSource();
		System.out.println("Page source code is: " + sourceCode);
		driver.close();
	}
}
