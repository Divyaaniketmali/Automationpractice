package assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook2 
{
	public static void main(String[] args) {
		System.out.println("Program start");
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		int count=0;
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg/");
		System.out.println("The Title of Current Page is"+driver.getTitle());
		List<WebElement> dateOp=driver.findElements(By.className("_9407"));
		for(int a=0;a<dateOp.size();a++) {
			dateOp.get(a).click();
			System.out.print("\nIsDateFieldIsEnabled"+dateOp.get(a).isEnabled());
			System.out.println("\tTitleOfField"+dateOp.get(a).getAttribute("title"));
			System.out.println("");
		}
		List<WebElement> Date2=driver.findElements(By.cssSelector("._9407:nth-of-type(1)>option"));
		for(int b=0;b<Date2.size();b++) {
			Date2.get(b).click();
			System.out.print(Date2.get(b).isEnabled());
			System.out.println("\t\t"+Date2.get(b).getText());
			List<WebElement> Date1=driver.findElements(By.cssSelector("._9407:nth-of-type(2)>option"));
			for(int b1=0;b1<Date1.size();b1++) {
				Date1.get(b1).click();
				System.out.print(Date1.get(b1).isEnabled());
				System.out.println("\t\t"+Date1.get(b1).getText());
				List<WebElement> Date=driver.findElements(By.cssSelector("._9407:nth-of-type(3)>option"));
				for(int b11=0;b11<Date.size();b11++) {
					Date.get(b11).click();
					System.out.print(Date.get(b11).isEnabled());
					System.out.println("\t\t"+Date.get(b11).getText());
					count++;
				}
			}
		}
		System.out.println("Count Of Test Executes"+count);
		System.out.println("Program ended");
	}
}

