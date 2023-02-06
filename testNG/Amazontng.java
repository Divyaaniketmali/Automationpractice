package testNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class Amazontng extends SeleniumUtility {
	@Test
	public void Amazon() {
		setUp("chrome", "https://www.amazon.in/");
		ChromeDriver driver = new ChromeDriver();
		// driver.get("https://www.amazon.in/");
		String pageTitle = driver.getTitle();
		System.out.println("Page title is: " + pageTitle);
		System.out.println("Page title is: " + pageTitle.equals(
				"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"));
		System.out.println("Page url is: " + driver.getCurrentUrl());
		String sourceCode = driver.getPageSource();
		System.out.println("Page source code is: " + sourceCode);
		System.out.println("Source code lenght: " + sourceCode.length());
		driver.close();
	}
}
