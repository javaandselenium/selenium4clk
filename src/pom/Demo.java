package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		//WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
       Test0 t=new Test0(driver);
		driver.navigate().refresh();
		t.serach("books");
     //   ele.sendKeys("books");
	}

}
