package screenShot;

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
		driver.manage().window().maximize();
		//Typecasting
		TakesScreenshot ts=(TakesScreenshot) driver;
//access the method
		File src = ts.getScreenshotAs(OutputType.FILE);
//specify the location
		File dest=new File("./photo/fb.png");
		//copy the photo src to dest
		FileUtils.copyFile(src, dest);
		
		driver.close();
		
	
	}

}
