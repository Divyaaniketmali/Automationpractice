package assignments;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RedBus {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Maximize window.
		driver.manage().window().maximize();
		//Open Redbus.
		driver.get("https://www.redbus.com");
		driver.findElement(By.className("bfMZDh")).click();
		//Cick on Pune.
		driver.findElement(By.cssSelector("#src")).sendKeys("Pune");
		driver.findElement(By.cssSelector("[data-id=\"67159\"]")).click();
		//Click on Goa.
		driver.findElement(By.cssSelector("#dest")).sendKeys("Goa");
		driver.findElement(By.cssSelector("[data-id=\"67123\"]")).click();
		//Click on date andselect date from next month.
		driver.findElement(By.id("date-box")).click();
		driver.findElement(By.cssSelector("div.dwWaPy>:nth-of-type(2)>span>:nth-child(5)>:nth-child(2)")).click();
		//Click on search button.
		driver.findElement(By.id("search_butn")).click();
		driver.findElement(By.cssSelector("div.kySmxb>.sc-fMiknA")).click();
		FluentWait wait=new FluentWait(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
	    driver.findElement(By.cssSelector("[for=\"dtAfter 6 pm\"]")).click();
	    driver.findElement(By.cssSelector("[for=\"bt_AC\"]")).click();
	    //To print names of buses in console.
	    List<WebElement>sugg=driver.findElements(By.cssSelector("div.travels"));
	    System.out.println("Buses Count:"+sugg.size());
	     for(int i=0;i<sugg.size();i++) {
	    	 System.out.println(sugg.get(i).getText());	 
	    
	}
	}
}
