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

    public class VtigerWidgets {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		WebElement Username=driver.findElement(By.id("username"));
		Username.clear();
		Username.sendKeys("admin");
		WebElement Password=driver.findElement(By.id("password"));
		Password.clear();
		Password.sendKeys("Test@123");
		//Click on login
		driver.findElement(By.className("buttonBlue")).click();
		//Click on widgets
		driver.findElement(By.className("addButton")).click();
		//Click on History and remove.
		driver.findElement(By.linkText("Historie")).click();
		WebDriverWait wait11=new WebDriverWait(driver,50);
		wait11.until(ExpectedConditions.elementToBeClickable(By.className("addButton")));
		//Click on widgets
		driver.findElement(By.className("addButton")).click();
		//Click on Calender Activities
		driver.findElement(By.linkText("aktuelle Aktivitäten")).click();
		// Remove history.
		driver.findElement(By.cssSelector("i[title=\"Remove\"]")).click();
		driver.findElement(By.cssSelector("div.modal-footer>.btn.confirm-box-ok")).click();
		FluentWait wait=new FluentWait(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		// Remove Calender Activities
		driver.navigate().refresh();
		driver.findElement(By.cssSelector("i[title=\"Remove\"]")).click();
		driver.findElement(By.cssSelector("div.modal-footer>.btn.confirm-box-ok")).click();
		
	}

}
