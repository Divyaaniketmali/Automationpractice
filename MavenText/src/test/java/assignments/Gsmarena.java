package assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gsmarena {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.gsmarena.com/");
		//driver.findElement(By.linkText("SAMSUNG")).click();
		//List<WebElement>menu=driver.findElements(By.cssSelector("div.brandmenu-v2"));
		List<WebElement> deviceList=driver.findElements(By.cssSelector("#div.brandmenu-v2>ul>li>a"));
		//List<WebElement>menu=driver.findElements(By.cssSelector("div.brandmenu-v2>p>a>i"));
		System.out.println("deviceList count: "+deviceList.size());
        for(int i=0;i<deviceList.size();i++) {
        System.out.println(deviceList.get(i).getText());
        }
        }
	}


