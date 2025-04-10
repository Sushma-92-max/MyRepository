package PageFactoryClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Constants.constants;
import Utilities.BaseClass;

public class NewCustomerCreation extends BaseClass{
	
	WebDriver driver;
	
	public NewCustomerCreation(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='New Customer']")
	WebElement newCustomerLink;
	
	@FindBy(xpath="//input[@name='name']")
	WebElement custName;
	
	@FindBy(xpath="//input[@value='m']")
	WebElement gender;
	
	@FindBy(xpath="//input[@type='date']")
	WebElement DOB;
	
	@FindBy(xpath="//textarea[@name='addr']")
	WebElement Address;
	
	@FindBy(xpath="//input[@name='city']")
	WebElement City;
	
	@FindBy(xpath="//input[@name='state']")
	WebElement State;
	
	@FindBy(xpath="//input[@name='pinno']")
	WebElement Pinno;
	
	@FindBy(xpath="//input[@name='telephoneno']")
	WebElement MobNo;
	
	@FindBy(xpath="//input[@name='emailid']")
	WebElement EmailID;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement Password1;
	
	@FindBy(xpath="//input[@value='Submit']")
	WebElement Submit;
	
	@FindBy(xpath="//*[@id=\"customer\"]/tbody/tr[4]/td[2]")
	WebElement cusID;
	
	public void clicknewcustomerlink() {
		newCustomerLink.click();
	}
	
	public void entercustomername(String cname) {//method name can be any random name but custName is webelement declared above cname any name
		custName.sendKeys(cname);
	}

	public void selectGender() {
		gender.click();
	}
	
	public void enterDOB(String dob) {
		DOB.sendKeys(dob);
	}
	
	public void enterAddress(String addr) {
		Address.sendKeys(addr);
	}
	
	public void enterCity(String city) {
		City.sendKeys(city);
	}
	
	public void enterState(String state) {
		State.sendKeys(state);
	}
	
	public void enterPinNumber(String pin) {
		Pinno.sendKeys(pin);
	}
	
	public void enterMobileNumber(String mob) {
		MobNo.sendKeys(mob);
	}
	public void enterEmailID(String email) {
		EmailID.sendKeys(email);
	}
	public void enterPassword1(String pass1) {
		Password1.sendKeys(pass1);
	}
	public void clickSubmit() {
		Submit.click();
	}
	public void getCusID(String cusid) {
		constants.CustomerID = cusID.getText();
		System.out.println(constants.CustomerID);
		
	}
}
