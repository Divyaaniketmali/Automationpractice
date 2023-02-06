package assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.findElement(By.linkText("Create New Account")).click();
		WebElement dateOp=driver.findElement(By.className("_9407"));
		 System.out.println("Date");
		// for display
		System.out.println("Date field visible or not? "+dateOp.isDisplayed());
		//for enable
		System.out.println("Date field editable or not? "+dateOp.isEnabled());
		//check whether dropdown is multiselect dropdown or not
		Select s1 =  new Select(dateOp);
		System.out.println("Date is multiselect dropdownlist:"+s1.isMultiple());
		//get option count 
				List<WebElement> options=(s1).getOptions();
				System.out.println("Option count for date is:"+options.size());
			//get default	
	     WebElement selectedOption=(s1).getFirstSelectedOption();
	     String selectedOptionName=selectedOption.getText();
		 System.out.println("Already selected date: "+(s1).getFirstSelectedOption().getText());
		 //to check value update or not
         (s1).selectByValue("20");
		 System.out.println("Updated Date: "+(s1).getFirstSelectedOption().getText());
		 //For Month
		 WebElement monthOp=driver.findElement(By.id("month"));
			// for display
		    System.out.println("Month");
			System.out.println("Month field visible or not? "+monthOp.isDisplayed());
			//for enable
			System.out.println("Month field editable or not? "+monthOp.isEnabled());
			//check whether dropdown is multiselect dropdown or not
			Select s2 =  new Select(monthOp);
			System.out.println("Month is multiselect dropdownlist:"+s2.isMultiple());
			//get option count 
		    List<WebElement> options1=(s2).getOptions();
			System.out.println("Option count for month is:"+options1.size());
				//get default	
		     WebElement selectedOption1=(s2).getFirstSelectedOption();
		     String selectedOptionName1=selectedOption.getText();
			 System.out.println("Already selected month name: "+(s2).getFirstSelectedOption().getText());
			 //to check value update or not
	         (s2).selectByValue("6");
			 System.out.println("Updated month: "+(s2).getFirstSelectedOption().getText());
			 //For Year
			 WebElement YearOp=driver.findElement(By.id("year"));
				// for display
			    System.out.println("Year");
				System.out.println("Year field visible or not? "+YearOp.isDisplayed());
				//for enable
				System.out.println("Year field editable or not? "+YearOp.isEnabled());
				//check whether dropdown is multiselect dropdown or not
				Select s3 =  new Select(YearOp);
				System.out.println("Year is multiselect dropdownlist:"+s3.isMultiple());
				//get option count 
			    List<WebElement> options11=(s3).getOptions();
				System.out.println("Option count for Year is:"+options11.size());
					//get default	
			     WebElement selectedOption11=(s2).getFirstSelectedOption();
			     String selectedOptionName11=selectedOption.getText();
				 System.out.println("Already selected Year is: "+(s3).getFirstSelectedOption().getText());
				 //to check value update or not
		         (s3).selectByValue("1995");
				 System.out.println("Updated Year: "+(s3).getFirstSelectedOption().getText());
	}	
	}



