package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		WebDriver driver=new ChromeDriver();
		
		FileInputStream fis=new FileInputStream("./data4sel.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String url = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		
		driver.get(url);
		driver.findElement(By.xpath("//a[text()='LOGIN']")).click();
		
		String us = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		driver.findElement(By.id("email")).sendKeys(us);
		
		String pwd = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		driver.findElement(By.id("password")).sendKeys(pwd);
		
		
		

	}

}
