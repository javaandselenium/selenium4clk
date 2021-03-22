package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test4 {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	
	WebDriverWait w=new WebDriverWait(driver,5);
	WebElement ele = driver.findElement(By.id("username"));
	w.until(ExpectedConditions.visibilityOf(ele)).sendKeys("admin");
	
	
	driver.findElement(By.name("pwd")).sendKeys("manager");
	
	
	WebElement ele1 = driver.findElement(By.xpath("//div[text()='Login ']"));
	w.until(ExpectedConditions.elementToBeClickable(ele1)).click();
	
	String title = driver.getTitle();
System.out.println(title);
String url = driver.getCurrentUrl();
System.out.println(url);
if(title.equals("actiTIME - Login")) {
	System.out.println("Pass:Home page is dispalyed");
}
else
{
	System.out.println("Fail:Home page is not dispalyed");
}
driver.close();	}

}
