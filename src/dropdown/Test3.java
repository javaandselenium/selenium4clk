package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		WebElement ele = driver.findElement(By.id("cars"));
		
		Select s=new Select(ele);
		s.selectByIndex(2);
		s.selectByValue("299");
		//s.selectByVisibleText("Free ( 90 ) ");
		
		System.out.println(s.isMultiple());
		
		if(s.isMultiple()){
			Thread.sleep(3000);
			s.deselectByIndex(2);
			Thread.sleep(3000);
			s.deselectByValue("299");
			Thread.sleep(3000);
			//s.deselectByVisibleText("Free ( 90 ) ");
			s.deselectAll();
			
			
			
		}
		
		Thread.sleep(3000);
		driver.close();
	}

}
