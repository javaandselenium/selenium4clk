package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Test0 {
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchTb;
	
	public Test0(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void serach(String name) {
		searchTb.sendKeys(name);
	}

}
