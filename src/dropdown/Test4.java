package dropdown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
WebElement ele = driver.findElement(By.id("month"));
Select s=new Select(ele);
s.selectByIndex(2);

s.selectByVisibleText("May");

s.selectByValue("11");

List<WebElement> alloption = s.getOptions();
System.out.println(alloption.size());

ArrayList a=new ArrayList<>();

for(WebElement b:alloption) {
String text = b.getText();
System.out.println(text);
a.add(text);
		
	}
System.out.println("***************After sorting**********************");
Collections.sort(a);

for(Object l:a) {
	System.out.println(l);
}

driver.close();













	}

}
