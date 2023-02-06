package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteAutomation {

	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver",".\\Drivers\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://demosite.executeautomation.com/Login.html");
		
		String pageTitle = driver.getTitle();
		System.out.println("Pagetitle is "+ pageTitle);
	    System.out.println("Pagetitle lenght: "+pageTitle.length());
	    System.out.println("Page url is: "+driver.getCurrentUrl() );
	    WebElement Input_UserName=driver.findElement(By.name("UserName"));
	    Input_UserName.sendKeys("execution");
		
		WebElement Input_Password=driver.findElement(By.name("Password"));
		Input_Password.sendKeys("admin");
		
		WebElement LoginInputField=driver.findElement(By.name("Login"));
		LoginInputField.submit();
		WebElement LogoutField=driver.findElement(By.tagName("Span"));
		LogoutField.click();
		driver.close();	
		
		
	}

}
