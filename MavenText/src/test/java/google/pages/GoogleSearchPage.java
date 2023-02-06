package google.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class GoogleSearchPage extends SeleniumUtility{
	WebDriver driver;
	@BeforeTest
	public void preCondition() {
		 driver=setUp("chrome", "https://www.google.com");
	}
	@Test
	public void testSearchPage() {	
		typeInput(driver.findElement(By.name("q")),"Selenium interview questions");
		getActiveElement().sendKeys(Keys.ENTER);
		Assert.assertEquals(getCurrentTitleOfApplication().toString(), ("Google search was not sucessfull"));
	}	
	
	private Object getCurrentTitleOfApplication() {
		// TODO Auto-generated method stub
		return null;
	}
	@AfterTest
	public void cleanUp() {
		tearDown();
	}
	public List<WebElement> searchTextAndGetSuggestions(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	public void searchText(String string) {
		// TODO Auto-generated method stub
		
	}
}