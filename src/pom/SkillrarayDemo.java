package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillrarayDemo {
	@FindBy(xpath="//a[text()='LOGIN']")
	private WebElement loginbtn;
	
	@FindBy(id="email")
	private WebElement usernametb;
	
	@FindBy(id="password")
	private WebElement passwordtb;
	
	@FindBy(id="last")
	private WebElement sumbitbtn;
	
	public SkillrarayDemo(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void loginButton() {
		loginbtn.click();
	}
	
	public void usernametextbox(String us) {
		usernametb.sendKeys(us);
	}
	
	public void passwordtextbox(String pwd) {
		passwordtb.sendKeys(pwd);
	}
	
	public void sumbitbutton() {
		sumbitbtn.click();
	}
	
	
	
	
	
	

	

}
