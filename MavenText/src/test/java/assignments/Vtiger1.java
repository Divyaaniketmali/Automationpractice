package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class Vtiger1 {

	public static void main(String[] args) {
		SeleniumUtility m1= new SeleniumUtility();
        WebDriver driver=m1.setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
        WebElement username=driver.findElement(By.id("username"));
	    username.clear();
	    username.sendKeys("admin");
	    WebElement pwd=driver.findElement(By.id("password"));
	    pwd.clear();
	    pwd.sendKeys("Test@123");
	    driver.findElement(By.className("buttonBlue")).click();
	    driver.findElement(By.id("appnavigator")).click();
	    driver.findElement(By.cssSelector("div.app-list>:nth-of-type(3)")).click();
	    driver.findElements(By.xpath("//div[@class='mCSB_container mCS_y_hidden mCS_no_scrollbar_y']/li/a")).get(7).click();
	    driver.findElement(By.id("Services_listView_basicAction_LBL_ADD_RECORD")).click();
		
	    
	}

}
