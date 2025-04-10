package PageFactoryClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class LoginPageGuru99 extends BaseClass {
	
	WebDriver driver;
	 
	public LoginPageGuru99(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@type='text']")
	WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	
	@FindBy(xpath="//input[@value='LOGIN']")
	WebElement login;
	
	
	public void enterUsername(String uname) {
		username.sendKeys(uname);
	}
	
	public void enterPassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void clickLogin() {
		login.click();
		
	}
}
