package webelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.id("username"));
	if(ele.isDisplayed()) {
		System.out.println("Pass:element is dislayed");
	}
	else
	{
		System.out.println("Fail:element is not dispalyed");
	}
	
	
WebElement btn = driver.findElement(By.xpath("//div[text()='Login ']"));
if(btn.isEnabled()) {
	System.out.println("pass:element is enabled");
}
else
{
	System.out.println("fail:element is not enabled");
}

WebElement ch = driver.findElement(By.id("keepLoggedInCheckBox"));
if(ch.isSelected()) {
	System.out.println("pass:element is selected");
}
else
{
	System.out.println("fail:element is not selected");
}

driver.close();
	}

}
