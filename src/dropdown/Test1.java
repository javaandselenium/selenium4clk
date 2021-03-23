package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
		WebElement ele = driver.findElement(By.id("gh-cat"));
		
		Select s=new Select(ele);
		s.selectByIndex(2);
		s.selectByValue("267");
		s.selectByVisibleText("Crafts");
		
		List<WebElement> allOptions = s.getOptions();
		System.out.println(allOptions.size());
		
		for(WebElement b:allOptions) {
			System.out.println(b.getText());
		}
		
		driver.close();
		
	}

}
