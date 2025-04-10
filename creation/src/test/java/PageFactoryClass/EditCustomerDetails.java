package PageFactoryClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Constants.constants;
import Utilities.BaseClass;

public class EditCustomerDetails extends BaseClass{

WebDriver driver;
	
	public EditCustomerDetails(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	
	@FindBy(xpath="//a[text()='Edit Customer']")
	WebElement EditCustomer;
	
	@FindBy(xpath="//input[@name='cusid']")
	WebElement pastecusid;
	
	@FindBy(xpath="//input[@name='AccSubmit']")
	WebElement AccSubmit;
	
	@FindBy(xpath="//textarea[@name='addr']")
	WebElement updateaddress;
	
	@FindBy(xpath="//input[@name='pinno']")
	WebElement updatepinno; 
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement updatesubmit;
	
	@FindBy(xpath="//a[text()='New Account']")
	WebElement NewAccount;
	
	@FindBy(xpath="//input[@name='cusid']")
	WebElement addCustID;
	
	@FindBy(xpath="//input[@name='inideposit']")
	WebElement InitialDeposit;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement createAcc;
	
	
	public void clickeditcust() {
		EditCustomer.click();
	}
	
	public void pastecustid(String custid) {
		pastecusid.sendKeys(constants.CustomerID);
	}
	
	public void clickeAccSubmit() {
		AccSubmit.click();
	}

	public void updateadd() {
		updateaddress.clear();
	    updateaddress.sendKeys("44 TH main road");
	}
	
	public void updatePinNumber() {
		updatepinno.clear();
		updatepinno.sendKeys("567890");
	}
	
	public void clickeUpdateSubmit() {
		updatesubmit.click();
	}
	
	public void clickNewAccount() {
		NewAccount.click();
	}
	
	public void addCustID(String custid) {
		addCustID.sendKeys(constants.CustomerID);
	}
	
	public void addInitialDeposit(String initdepo) {
		InitialDeposit.sendKeys(initdepo);
	}
	
	public void clickcreateAcc() {
		createAcc.click();
	}
	
}
