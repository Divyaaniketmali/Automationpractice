package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automationtesting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://automationtesting.in/Register.html");
        String pageTitle=driver.getTitle();
        System.out.println("Page title is: "+ pageTitle);
        System.out.println("Page title is: "+ pageTitle.equals("Page not found | Selenium Webdriver Appium Complete Tutorial"));
        System.out.println("Page url is: "+driver.getCurrentUrl() );
        String sourceCode=driver.getPageSource();
        System.out.println("Page source code is: "+sourceCode);
        System.out.println("Source code lenght: "+sourceCode.length());
        driver.close();
        
        
	}
     
}
