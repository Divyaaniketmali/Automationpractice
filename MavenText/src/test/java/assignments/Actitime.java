package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.SeleniumUtility;

public class Actitime extends SeleniumUtility {

	public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://demo.actitime.com/");
    String pageTitle=driver.getTitle();
    System.out.println("Pagetitle is "+ pageTitle);
    System.out.println("Pagetitle lenght: "+pageTitle.length());
    System.out.println("Page url is: "+driver.getCurrentUrl() );
    String sourceCode=driver.getPageSource();
    System.out.println("Page source code is: "+sourceCode);
    System.out.println("Source code lenght: "+sourceCode.length());
    driver.close();

	}

}
//setTimeout(function(){debugger;}, 5000)