package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ORAGHRM {

	public static void main(String[] args) {
		
				System.out.println("Program Start");
				System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				driver.navigate().refresh();
				driver.findElement(By.name("username")).sendKeys("Admin",Keys.TAB);
				driver.findElement(By.name("password")).sendKeys("admin123",Keys.ENTER);
				driver.findElement(By.xpath("//li/a/span[text()='PIM']")).click();
				driver.findElement(By.cssSelector(".orangehrm-header-container .oxd-button.oxd-button--medium.oxd-button--secondary")).click();
				driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Avinash",Keys.TAB,"Ramensh",Keys.TAB,"Bhole",Keys.TAB,"2335555");
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				driver.findElement(By.xpath("//li/a/span[text()='PIM']")).click();
				driver.findElement(By.xpath("//div[2]/input[@class='oxd-input oxd-input--active']")).sendKeys("2335555");
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				try {
					driver.findElement(By.xpath("//div[@class='oxd-table-body']//div[@class='oxd-checkbox-wrapper']/label/span/i")).click();
					driver.findElement(By.cssSelector(".oxd-icon.bi-trash")).click();
//					driver.findElement(By.xpath("//div[span[text()='(1) Record Selected']]/button")).click();
					driver.findElement(By.cssSelector(".oxd-icon.bi-trash.oxd-button-icon")).click();
				}catch (StaleElementReferenceException e) {
					driver.findElement(By.xpath("//div[@class='oxd-table-body']//div[@class='oxd-checkbox-wrapper']/label/span/i")).click();
					driver.findElement(By.cssSelector(".oxd-icon.bi-trash")).click();
//					driver.findElement(By.xpath("//div[span[text()='(1) Record Selected']]/button")).click();
					driver.findElement(By.cssSelector(".oxd-icon.bi-trash.oxd-button-icon")).click();
				}
				System.out.println("Is Employee is deleted "+driver.findElement(By.xpath("//span[text()='No Records Found']")).isDisplayed());
				System.out.println("Program ends");
			}

		
	}


