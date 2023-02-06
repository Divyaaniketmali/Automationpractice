package assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Phoneprice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		// step2: create an instance of Chrome Browser
		WebDriver driver = new ChromeDriver();
		// maximize browser
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.demoblaze.com/");

		List<WebElement>phones = driver.findElements(By.cssSelector("#tbodyid>div>div>div>h4>a"));
		List<WebElement>phonesprice = driver.findElements(By.cssSelector("#tbodyid>div>div>div>h5"));
		 System.out.println("Suggestion count: "+phones.size());
			for(int i=0;i<phones.size();i++) {
			//System.out.println(phones.get(i).getText());
			for(int i1=0;i1<=phonesprice.size();i1++) {
				//System.out.println(phonesprice.get(i1).getText());
		System.out.println(phones.get(i1).getText() +  phonesprice.get(i1).getText());
				
			}	
	}
	}
}
