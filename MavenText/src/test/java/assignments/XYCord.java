package assignments;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class XYCord {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Register.html");
        
            WebElement firstnameInputField=driver.findElement(By.cssSelector("[placeholder=\"First Name\"]"));
            Point firstnamePosition=firstnameInputField.getLocation();
		    int firstname_X_Cord=firstnamePosition.getX();
		    int firstname_Y_Cord=firstnamePosition.getY();
		    System.out.println("firstname x-cords---> "+firstname_X_Cord);
		    System.out.println("firstname y-cords---> "+firstname_Y_Cord);
		
		    WebElement lastnameInputField=driver.findElement(By.cssSelector("[placeholder=\"Last Name\"]"));
	        Point lastnamePosition=lastnameInputField.getLocation();
			int lastname_X_Cord=lastnamePosition.getX();
			int lastname_Y_Cord=lastnamePosition.getY();
			System.out.println("lastname x-cords---> "+lastname_X_Cord);
			System.out.println("lastname y-cords---> "+lastname_Y_Cord);
			System.out.println("Is lastname is on right side of firstname : "+(firstname_X_Cord<lastname_X_Cord));
			
			WebElement addressInputField=driver.findElement(By.cssSelector("[ng-model=\"Adress\"]"));
	        Point addressPosition=addressInputField.getLocation();
			int address_X_Cord=addressPosition.getX();
			int address_Y_Cord=addressPosition.getY();
			System.out.println("address x-cords---> "+address_X_Cord);
			System.out.println("address y-cords---> "+address_Y_Cord);
			System.out.println("Is firstname is above of address : "+(firstname_Y_Cord<address_Y_Cord));
			
			WebElement emailaddressInputField=driver.findElement(By.cssSelector("[ng-model=\"EmailAdress\"]"));
	        Point emailaddressPosition=emailaddressInputField.getLocation();
			int emailaddress_X_Cord=emailaddressPosition.getX();
			int emailaddress_Y_Cord=emailaddressPosition.getY();
			System.out.println("emailaddress x-cords---> "+emailaddress_X_Cord);
			System.out.println("emailaddress y-cords---> "+emailaddress_Y_Cord);
			System.out.println("Is emailaddress is below of address : "+(emailaddress_Y_Cord>address_Y_Cord));
			
			WebElement phoneInputField=driver.findElement(By.cssSelector("[ng-model=\"Phone\"]"));
	        Point phonePosition=phoneInputField.getLocation();
			int phone_X_Cord=phonePosition.getX();
			int phone_Y_Cord=phonePosition.getY();
			System.out.println("phone x-cords---> "+phone_X_Cord);
			System.out.println("phone y-cords---> "+phone_Y_Cord);
			System.out.println("Is phone is below of emailaddress : "+(phone_Y_Cord>emailaddress_Y_Cord));
			
			WebElement maleInputField=driver.findElement(By.cssSelector("[value=\"Male\"]"));
	        Point malePosition=maleInputField.getLocation();
			int male_X_Cord=malePosition.getX();
			int male_Y_Cord=malePosition.getY();
			System.out.println("male x-cords---> "+male_X_Cord);
			System.out.println("male y-cords---> "+male_Y_Cord);
			System.out.println("Is male button is below of phone : "+(male_Y_Cord>phone_Y_Cord));
			
			WebElement femaleInputField=driver.findElement(By.cssSelector("[value=\"FeMale\"]"));
	        Point femalePosition=femaleInputField.getLocation();
			int female_X_Cord=femalePosition.getX();
			int female_Y_Cord=femalePosition.getY();
			System.out.println("female x-cords---> "+female_X_Cord);
			System.out.println("female y-cords---> "+female_Y_Cord);
			System.out.println("Is female button is right side of male : "+(female_X_Cord>male_Y_Cord));
			
			WebElement cricketInputField=driver.findElement(By.cssSelector("[value=\"Cricket\"]"));
	        Point cricketPosition=cricketInputField.getLocation();
			int cricket_X_Cord=cricketPosition.getX();
			int cricket_Y_Cord=cricketPosition.getY();
			System.out.println("cricket x-cords---> "+cricket_X_Cord);
			System.out.println("cricket y-cords---> "+cricket_Y_Cord);
			System.out.println("Is cricket button is below of female button : "+(cricket_Y_Cord>female_Y_Cord));
			
			WebElement MoviesInputField=driver.findElement(By.cssSelector("[value=\"Movies\"]"));
	        Point MoviesPosition=MoviesInputField.getLocation();
			int Movies_X_Cord=MoviesPosition.getX();
			int Movies_Y_Cord=MoviesPosition.getY();
			System.out.println("Movies x-cords---> "+Movies_X_Cord);
			System.out.println("Movies y-cords---> "+Movies_Y_Cord);
			System.out.println("Is Movies button is below of cricket button : "+(Movies_Y_Cord>cricket_Y_Cord));
			
			WebElement HockeyInputField=driver.findElement(By.cssSelector("[value=\"Hockey\"]"));
	        Point HockeyPosition=HockeyInputField.getLocation();
			int Hockey_X_Cord=HockeyPosition.getX();
			int Hockey_Y_Cord=HockeyPosition.getY();
			System.out.println("Hockey x-cords---> "+Hockey_X_Cord);
			System.out.println("Hockey y-cords---> "+Hockey_Y_Cord);
			System.out.println("Is Hockey button is below of Movies button : "+(Hockey_Y_Cord>Movies_Y_Cord));
			
			WebElement LanguagesInputField=driver.findElement(By.id("msdd"));
	        Point LanguagesPosition=LanguagesInputField.getLocation();
			int Languages_X_Cord=LanguagesPosition.getX();
			int Languages_Y_Cord=LanguagesPosition.getY();
			System.out.println("Languages x-cords---> "+Languages_X_Cord);
			System.out.println("Languages y-cords---> "+Languages_Y_Cord);
			System.out.println("Is Languages button is below of Hockey button : "+(Languages_Y_Cord>Hockey_Y_Cord));
			
			WebElement SkillsInputField=driver.findElement(By.cssSelector("[ng-model=\"Skill\"]"));
	        Point SkillsPosition=SkillsInputField.getLocation();
			int Skills_X_Cord=SkillsPosition.getX();
			int Skills_Y_Cord=SkillsPosition.getY();
			System.out.println("Skills x-cords---> "+Skills_X_Cord);
			System.out.println("Skills y-cords---> "+Skills_Y_Cord);
			System.out.println("Is Skills button is below of Languages button : "+(Skills_Y_Cord>Languages_Y_Cord));
			
			WebElement CountryInputField=driver.findElement(By.cssSelector("[ng-init=\"country=''\"]"));
	        Point CountryPosition=CountryInputField.getLocation();
			int Country_X_Cord=CountryPosition.getX();
			int Country_Y_Cord=CountryPosition.getY();
			System.out.println("Country x-cords---> "+Country_X_Cord);
			System.out.println("Country y-cords---> "+Country_Y_Cord);
			System.out.println("Is Country button is below of Languages button : "+(Country_Y_Cord>Skills_Y_Cord));
			
			WebElement SelectCountryInputField=driver.findElement(By.cssSelector("[aria-haspopup=\"true\"]"));
	        Point SelectCountryPosition=SelectCountryInputField.getLocation();
			int SelectCountry_X_Cord=SelectCountryPosition.getX();
			int SelectCountry_Y_Cord=SelectCountryPosition.getY();
			System.out.println("SelectCountry x-cords---> "+SelectCountry_X_Cord);
			System.out.println("SelectCountry y-cords---> "+SelectCountry_Y_Cord);
			System.out.println("Is SelectCountry button is below of Country button : "+(SelectCountry_Y_Cord>Country_Y_Cord));
			
			WebElement YearInputField=driver.findElement(By.id("yearbox"));
	        Point YearPosition=YearInputField.getLocation();
			int Year_X_Cord=YearPosition.getX();
			int Year_Y_Cord=YearPosition.getY();
			System.out.println("Year x-cords---> "+Year_X_Cord);
			System.out.println("Year y-cords---> "+Year_Y_Cord);
			System.out.println("Is Year button is below of SelectCountry button : "+(Year_Y_Cord>SelectCountry_Y_Cord));
			
			WebElement MonthInputField=driver.findElement(By.cssSelector("[placeholder=\"Month\"]"));
	        Point MonthPosition=MonthInputField.getLocation();
			int Month_X_Cord=MonthPosition.getX();
			int Month_Y_Cord=MonthPosition.getY();
			System.out.println("Month x-cords---> "+Month_X_Cord);
			System.out.println("Month y-cords---> "+Month_Y_Cord);
			System.out.println("Is Month is on right side of Year : "+(Year_X_Cord<Month_X_Cord));
			
			WebElement DayInputField=driver.findElement(By.cssSelector("[placeholder=\"Day\"]"));
	        Point DayPosition=DayInputField.getLocation();
			int Day_X_Cord=DayPosition.getX();
			int Day_Y_Cord=DayPosition.getY();
			System.out.println("Day x-cords---> "+Day_X_Cord);
			System.out.println("Day y-cords---> "+Day_Y_Cord);
			System.out.println("Is Day is on right side of Month : "+(Month_X_Cord<Day_X_Cord));
			
			WebElement PasswordInputField=driver.findElement(By.cssSelector("[ng-model=\"Password\"]"));
	        Point PasswordPosition=PasswordInputField.getLocation();
			int Password_X_Cord=PasswordPosition.getX();
			int Password_Y_Cord=PasswordPosition.getY();
			System.out.println("Password x-cords---> "+Password_X_Cord);
			System.out.println("Password y-cords---> "+Password_Y_Cord);
			System.out.println("Is Password button is below of Year : "+(Password_Y_Cord>Year_X_Cord));
			
			WebElement ConfirmPasswordInputField=driver.findElement(By.cssSelector("[ng-model=\"CPassword\"]"));
	        Point ConfirmPasswordPosition=ConfirmPasswordInputField.getLocation();
			int ConfirmPassword_X_Cord=ConfirmPasswordPosition.getX();
			int ConfirmPassword_Y_Cord=ConfirmPasswordPosition.getY();
			System.out.println("ConfirmPassword x-cords---> "+ConfirmPassword_X_Cord);
			System.out.println("ConfirmPassword y-cords---> "+ConfirmPassword_Y_Cord);
			System.out.println("Is ConfirmPassword button is below of Password : "+(ConfirmPassword_Y_Cord>Password_Y_Cord));
			
			//To print colour of submit.
			WebElement SubmitButton=driver.findElement(By.id("submitbtn"));
			String SubmitInRGBA=SubmitButton.getCssValue("color");
			String SubmitFontSize=SubmitButton.getCssValue("font-size");
			System.out.println("Submit Button Color code: "+SubmitInRGBA);
			System.out.println("Submit Button Font size: "+SubmitFontSize);
			//To print colour of refresh.
			WebElement RefreshButton=driver.findElement(By.cssSelector("[value=\"Refresh\"]"));
			String RefreshInRGBA=RefreshButton.getCssValue("color");
			String RefreshFontSize=RefreshButton.getCssValue("font-size");
			System.out.println("Refresh Button Color code: "+RefreshInRGBA);
			System.out.println("Refresh Button Font size: "+RefreshFontSize);
			
			
			
	}

}
