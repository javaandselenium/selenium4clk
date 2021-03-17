package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) {
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("dfdfgdfgcbvgggfg");
	driver.findElement(By.name("pass")).sendKeys("gjhfghgfhghfgh");
	
	//driver.findElement(By.linkText("Forgotten password?")).click();
	
	driver.findElement(By.partialLinkText("password?")).click();
	driver.findElement(By.id("identify_email")).sendKeys("5776567676");
	
	

	}

}
