

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        driver.getCurrentUrl();
        System.out.println("Page url is: "+driver.getCurrentUrl());
        String sourceCode=driver.getPageSource();
        System.out.println("Page source code is: "+sourceCode);
        driver.close();
        
	}

}
