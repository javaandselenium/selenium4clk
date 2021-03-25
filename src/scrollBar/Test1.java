package scrollBar;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
       js.executeScript("window.scrollBy(0,5000)");
	
       Thread.sleep(4000);
       
       js.executeScript("window.scrollBy(0,-5000)");
	}

}
