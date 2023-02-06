package assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.SeleniumUtility;

public class Flipkart extends SeleniumUtility {

	public void main(String[] args) {
		setUp("chrome","https://www.flipkart.com");
		ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("https://www.flipkart.com");
       // driver.get("https://r.search.yahoo.com/_ylt=AwrwBpXetJRjHbEA8w_nHgx.;_ylu=Y29sbwMEcG9zAzEEdnRpZAMEc2VjA3Ny/RV=2/RE=1670718814/RO=10/RU=https%3a%2f%2fwww.flipkart.com%2f/RK=2/RS=DrUzdCiP.aK5nRXiI6_9Sn7D21I-");
        List<WebElement> menu=driver.findElements(By.cssSelector("div.eFQ30H"));
        System.out.println("Suggestion count: "+menu.size());
		for(int i=0;i<menu.size();i++) {
		System.out.println(menu.get(i).getText());
        
		}
	}

}