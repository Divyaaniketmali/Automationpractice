package assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtility;

public class Flipkart1 extends SeleniumUtility {

	public void main(String[] args) {
		setUp("chrome","https://www.flipkart.com");
		ChromeDriver driver=new ChromeDriver();
        //To remove popup. 
        driver.findElement(By.cssSelector("div._2QfC02>._2KpZ6l")).click();
        Actions act=new Actions(driver);
      //Fasion
    	WebElement Fashion= driver.findElement(By.xpath("//div[text()='Fashion']"));
    	act.moveToElement(Fashion).perform();
    	List<WebElement> fashionsubtitle = driver.findElements(By.cssSelector("div[class='_2IjXr8']>div>a"));
    	
    	//Printing all sub elements of Fashion
    	for(int i=0; i<fashionsubtitle.size(); i++)
    	{
    		String s = fashionsubtitle.get(i).getText();
    		System.out.println("fashionsubtitle = " +s);
    	}

        //Electronics
    	WebElement Electronics= driver.findElement(By.xpath("//div[text()='Electronics']"));
        act.moveToElement(Electronics).perform();
        List<WebElement> electronics =driver.findElements(By.cssSelector("div._2IjXr8>div>a"));
        
        //Printing all sub elements of Electronics
        for(int i=0; i<electronics.size(); i++)
    	{
    		String s2 = electronics.get(i).getText();
    		System.out.println("electronics = " +s2);
    		 //Home
        	WebElement Home= driver.findElement(By.xpath("//div[text()='Home']"));
            act.moveToElement(Home).perform();
            List<WebElement> Home1 =driver.findElements(By.cssSelector("div._2IjXr8>div>a"));
            
            //Printing all sub elements of Home
            for(int i1=0; i1<Home1.size(); i1++)
        	{
        		String f = Home1.get(i1).getText();
        		System.out.println("Home = " +f);
        		 //Toys
            	WebElement Toys= driver.findElement(By.xpath("//div [text()='Beauty, Toys & More']"));
                act.moveToElement(Toys).perform();
                List<WebElement> toys =driver.findElements(By.cssSelector("div._2IjXr8>div>a"));
                
                //Printing all sub elements of Electronics
                for(int i11=0; i11<toys.size(); i11++)
            	{
            		String s211 = toys.get(i11).getText();
            		System.out.println("Toys = " +s211);
    	}
	}  }}
    	}

	
