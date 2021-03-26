package sceenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//Typecasting
		TakesScreenshot ts=(TakesScreenshot)driver;
		//access the method
		File src = ts.getScreenshotAs(OutputType.FILE);
		//specify location
		File dest=new File("./photo/fb.png");
		//copy file
		FileUtils.copyFile(src, dest);
		driver.close();
	}

}
