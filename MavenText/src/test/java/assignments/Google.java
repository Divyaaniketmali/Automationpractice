package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.SeleniumUtility;

public class Google extends SeleniumUtility {

	public void main(String[] args) {
		setUp("chrome","https://www.google.com");
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.getCurrentUrl();
        System.out.println("Page url is: "+driver.getCurrentUrl());
        String sourceCode=driver.getPageSource();
        System.out.println("Page source code is: "+sourceCode);
        driver.close();
        
	}

}
