package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangehrmXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        //Click on Password.
        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).click();
        //Click on Login.
        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[2]/form/div[3]")).click();
        //Click on forget password.
        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[2]/form/div[4]")).click();
        
	}

}
