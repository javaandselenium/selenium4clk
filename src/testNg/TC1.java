package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class TC1 {
	public WebDriver driver;
	@BeforeMethod
	public void openApp() {
	    driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	
	}
	
	@Test
	public void Login() {
		driver.findElement(By.id("email")).sendKeys("qwertyuiop");
		driver.findElement(By.id("pass")).sendKeys("qtrtyuiiyygiuo");
		//driver.findElement(By.name("login")).click();
		String t = driver.getTitle();
		
		
		Assert.assertEquals(actual, expected);
		
		SoftAssert s=new SoftAssert();
		s.assertEquals(actual, expected);
		
		
		Reporter.log(t,true);
		String url = driver.getCurrentUrl();
		Reporter.log(url,true);
		
	}
	
	@AfterMethod
	public void closeApp() {
		driver.close();
	}
	

}
