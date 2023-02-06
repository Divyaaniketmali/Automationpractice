package assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlelocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\\\Drivers\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Test Cases in Testing");
		
		List<WebElement> sugg=driver.findElements(By.cssSelector("ul>li>div.eIPGRd>div.pcTkSc>div.wM6W7d>span"));
		System.out.println("Suggestion count: "+sugg.size());
		for(int i=0;i<sugg.size();i++) {
			//to avoid SteleElementException, re-identify all the suggestions
			sugg=driver.findElements(By.cssSelector("ul>li>div.eIPGRd>div.pcTkSc>div.wM6W7d>span"));
			System.out.println(sugg.get(i).getText());
		
		
		}
	}

}
