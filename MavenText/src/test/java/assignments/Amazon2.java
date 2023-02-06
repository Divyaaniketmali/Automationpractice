package assignments;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(1500);
		driver.manage().window().setSize(new Dimension(450,600));
		driver.manage().window().maximize();
		String pageTitle = driver.getTitle();
		System.out.println("Pagetitle is "+ pageTitle);
		driver.findElement(By.linkText("Customer Service")).click();
		String pageTitle1 = driver.getTitle();
		System.out.println("Pagetitle is "+ pageTitle1);
		driver.navigate().back();
		driver.findElement(By.linkText("Mobiles")).click();
		String pageTitle11 = driver.getTitle();
		System.out.println("Pagetitle is "+ pageTitle11);
		driver.navigate().back();
		driver.findElement(By.linkText("Electronics")).click();
		String pageTitle111 = driver.getTitle();
		System.out.println("Pagetitle is "+ pageTitle111);
		driver.navigate().back();
		driver.close();

	}

}
