package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartPriceXpath {

	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
			// step2: create an instance of Chrome Browser
			WebDriver driver = new ChromeDriver();
			// maximize browser
			driver.manage().window().maximize();
			// implicit wait
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://www.flipkart.com/samsung-mobile-store");
			//div[div[a[text()='SAMSUNG Galaxy F13 (Nightsky Green, 64 GB)']]]/div/div/div

	}

}
