package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrm1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com");
        String pageTitle=driver.getTitle();
        System.out.println("Page title is: "+ pageTitle);
        System.out.println("Page title is: "+ pageTitle.equals("OrangeHRM"));
        System.out.println("Page url is: "+driver.getCurrentUrl() );
        String sourceCode=driver.getPageSource();
        System.out.println("Page source code is: "+sourceCode);
        System.out.println("Source code lenght: "+sourceCode.length());
        driver.close();
	}   
        
	}