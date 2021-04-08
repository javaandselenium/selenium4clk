package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoapp.skillrary.com/");
	
	SkillrarayDemo s=new SkillrarayDemo(driver);
	s.loginButton();
	s.usernametextbox("user");
	s.passwordtextbox("user");
	s.sumbitbutton();

	}

}
