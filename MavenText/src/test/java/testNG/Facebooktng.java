package testNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class Facebooktng extends SeleniumUtility {
	@Test
	public void Facebook() {
		setUp("chrome", "https://www.facebook.com");
		ChromeDriver driver = new ChromeDriver();
		// driver.get("https://www.facebook.com");
		String pageTitle = driver.getTitle();
		System.out.println("Pagetitle is " + pageTitle);
		driver.close();
	}
}
