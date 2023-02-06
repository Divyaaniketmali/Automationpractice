package assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cricinfo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.espncricinfo.com");
		//List<WebElement>menu=driver.findElements(By.cssSelector("ci-nav-item.ci-nav-text.ci-nav-hover.ds-cursor-pointer"));
		List<WebElement>menu=driver.findElements(By.cssSelector("div>.ds-popper-wrapper>a"));
		System.out.println("Suggestion count: "+menu.size());
		for(int i=0;i<menu.size();i++) {
		System.out.println(menu.get(i).getText());
	}
	}
}
