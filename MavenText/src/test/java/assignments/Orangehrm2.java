package assignments;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Orangehrm2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("Login page title: "+driver.getTitle());
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.tagName("button")).click();
		//Click on PIM button.
		driver.findElement(By.cssSelector("ul>li:nth-of-type(2)")).click();
		//Click on add button.
		driver.findElement(By.cssSelector("div.orangehrm-header-container>button")).click();
		//click on add employee
		//driver.findElement(By.cssSelector("header.oxd-topbar>div.oxd-topbar-body>nav>ul>li:nth-of-type(3)")).click();
		//Add first name and last name.
	    driver.findElement(By.cssSelector("[name=\"firstName\"]")).sendKeys("Divya");
	    driver.findElement(By.cssSelector("[name=\"lastName\"]")).sendKeys("Mali");    
	  // Clear the already filled emid and fill new id.
	    driver.findElement(By.cssSelector("div.oxd-grid-2>div>div>div:nth-of-type(2)>input")).sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.BACK_SPACE));
	    driver.findElement(By.cssSelector("div.oxd-grid-2>div>div>div:nth-of-type(2)>input")).sendKeys("0015");
	    //Click on save.
	   // Thread.sleep(1500);
		driver.findElement(By.cssSelector(".orangehrm-left-space")).click();
		//Click on PIM button.
		driver.findElement(By.cssSelector("ul>li:nth-of-type(2)")).click();
		//Enter empid.
		driver.findElement(By.cssSelector("div.oxd-form-row>div>div:nth-of-type(2)>div>div:nth-of-type(2)>input")).sendKeys("0015",Keys.ENTER);
		//Click on Search button.
     	driver.findElement(By.cssSelector(".orangehrm-left-space")).click();
     	//Click on id chechbox.
		driver.findElement(By.cssSelector("div.oxd-table-row>div>div>label>span")).click();
		//Click on edit chechbox.
		driver.findElement(By.cssSelector("button.oxd-icon-button>i.bi-pencil-fill")).click();
		//Click on Job.
		driver.findElement(By.cssSelector("div.orangehrm-tabs>div:nth-of-type(6)")).click();
		//Click on job title.
		/**WebElement QA Lead=driver.findElements(By.cssSelector("div.orangehrm-edit-employee-content>div>form>div>div>div>:nth-of-type(1)>div>div>div>div>i"));
		Thread.sleep(1500);
		projectList.get(0).click();
		//driver.findElements(By.cssSelector("div.orangehrm-edit-employee-content>div>form>div>div>div>:nth-of-type(1)>div>div>div>div>i"));
		//projectList.get(0).click();
		//WebElement username=driver.findElements(By.cssSelector("div.oxd-icon bi-caret-down-fill oxd-select-text--arrow"));
		act.moveToElement(QA Lead).doubleClick.perform();
		Thread.sleep(1500); 
		projectList1.get(0).click();*/
		driver.findElement(By.cssSelector("driver.findElement(By.cssSelector(\"div.orangehrm-tabs>div:nth-of-type(6)\")).click();"));
	
	}

	}
