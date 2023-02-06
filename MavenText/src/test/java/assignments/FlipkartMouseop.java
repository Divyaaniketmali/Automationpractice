package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.SeleniumUtility;

public class FlipkartMouseop {

	public static void main(String[] args) throws InterruptedException {
		SeleniumUtility m1= new SeleniumUtility();
        WebDriver driver=m1.setUp("chrome", "https://www.flipkart.com");
        WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div._2QfC02>._2KpZ6l")));
        driver.findElement(By.cssSelector("div._2QfC02>._2KpZ6l")).click();
        List<WebElement>menu=driver.findElements(By.cssSelector("div._2tvxW>div>div>.eFQ30H"));
        System.out.println("Menu option count :"+ menu.size());
        Actions act=new Actions(driver);
        for(int i =0;i<menu.size();i++) {
        	WebElement option=menu.get(i);
        	act.moveToElement(option).perform();
        	Thread.sleep(1000);
        }
        
	}

}
