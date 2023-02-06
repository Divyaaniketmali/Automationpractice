package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampleapp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://sampleapp.tricentis.com/101/");
        String pageTitle=driver.getTitle();
        System.out.println("Page title is: "+ pageTitle);
        System.out.println("Page title is: "+ pageTitle.equals("Tricentis Vehicle Insurance"));
        System.out.println("Page url is: "+driver.getCurrentUrl() );
        String sourceCode=driver.getPageSource();
        System.out.println("Page source code is: "+sourceCode);
        System.out.println("Source code lenght: "+sourceCode.length());
        driver.close();
	}   
        
	}
