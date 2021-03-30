package popups;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");

		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Set<String> child = driver.getWindowHandles();
		System.out.println(child);

		System.out.println(child.size());
           
		child.remove(parent);
		
		for (String b : child) {
			driver.switchTo().window(b);
			System.out.println(driver.getTitle());
			driver.close();
		}
		
	}

}
