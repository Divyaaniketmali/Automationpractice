package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.SeleniumUtility;

public class Facebook extends SeleniumUtility {

	public void main(String[] args) {
		setUp("chrome","https://www.facebook.com");
		ChromeDriver driver=new ChromeDriver();
		//driver.get("https://www.facebook.com");
		String pageTitle=driver.getTitle();
	    System.out.println("Pagetitle is "+ pageTitle);
		driver.close();
		
		
	}

}
