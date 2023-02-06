package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Techlistic {

	public static void main(String[] args) throws InterruptedException   {
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.techlistic.com/");
		driver.manage().window().maximize();
		Thread.sleep(1500);
		//driver.manage().window().setSize(new Dimension(450,600));
		
		driver.findElement(By.linkText("JAVA")).click();
		String pageTitle = driver.getTitle();
		 System.out.println("Page title is: "+ pageTitle);
		System.out.println("Pagetitle is "+ pageTitle.equals("JAVA.html"));
		Thread.sleep(1500);
		driver.navigate().back();
		
		driver.findElement(By.linkText("SELENIUM")).click();
		String pageTitle1 = driver.getTitle();
		 System.out.println("Page title is: "+ pageTitle);
		System.out.println("Pagetitle is "+ pageTitle1.equals("SELENIUM"));
		Thread.sleep(1500);
		driver.navigate().back();
		
		driver.findElement(By.linkText("BDD")).click();
		String pageTitle11 = driver.getTitle();
		 System.out.println("Page title is: "+ pageTitle);
		System.out.println("Pagetitle is "+ pageTitle11.equals("BDD"));
		Thread.sleep(1500);
		driver.navigate().back();
		
		driver.findElement(By.linkText("TESTING")).click();
		String pageTitle111 = driver.getTitle();
		 System.out.println("Page title is: "+ pageTitle);
		System.out.println("Pagetitle is "+ pageTitle111.equals("TESTING"));
		Thread.sleep(1500);
		driver.navigate().back();
		driver.close();

	}


}
