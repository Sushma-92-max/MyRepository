package StepDefinition2;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
//import org.testng.Assert;

import Constants.constants;
import PageFactoryClass.EditCustomerDetails;
import PageFactoryClass.LoginPageGuru99;
import PageFactoryClass.NewCustomerCreation;
import Utilities.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class StepDefinition2 extends BaseClass {
	
	private static Logger logger = LogManager.getLogger(BaseClass.class);
	
	WebDriver driver = BaseClass.initializeDriver();//calling method from BaseClass
	LoginPageGuru99 obj = new LoginPageGuru99(driver);//creating obj from BaseClass and initializing the same driver
	NewCustomerCreation obj1 = new NewCustomerCreation(driver);
	EditCustomerDetails obj2 = new EditCustomerDetails(driver);

	@Given("user loads the URL in the Browser")
	public void user_loads_the_url_in_the_browser() throws IOException {

		System.out.println("Application launched");
		logger.info("Browser Launched");
		maximizeWindow();
		TakeScreenshot();
		getTitle();
		
		
	}

	@Given("user enters the username in the uname field as {string}")
	public void user_enters_the_username_in_the_uname_field_as(String username) {
		
		obj.enterUsername(username);
		addImplicitWait();
	}

	@Given("user enters the password in the password field as {string}")
	public void user_enters_the_password_in_the_password_field_as(String password) {
		
		obj.enterPassword(password);
		addImplicitWait();
	}

	@When("user clicks on the login button in application")
	public void user_clicks_on_the_login_button_in_application() {
		
		obj.clickLogin();
	}

	@Then("the user will be navigated to Guru99 demo applications homepage")
	public void the_user_will_be_navigated_to_guru99_demo_applications_homepage() throws InterruptedException {
		
		 getTitle();
		 //scrolldown();
		 addImplicitWait();
		//Assert.assertEquals( getTitle(), "Guru99 Bank Manager HomePage");
		
	}

	@Then("user clicks on New Customer Creation link in the demoguru app")
	public void user_clicks_on_new_customer_creation_link_in_the_demoguru_app() {
		
		obj1.clicknewcustomerlink();
		 getTitle();
		 addImplicitWait();

	}

	@Then("user enters the Customer name in the app as {string}")
	public void user_enters_the_customer_name_in_the_app_as(String customer_name) {//update the string here paste from Feature file
		
		obj1.entercustomername(customer_name);//then add the string here no error will come

	}

	@Then("user selects the gender")
	public void user_selects_the_gender() {
		
		obj1.selectGender();

	}

	@Then("user enters the date of birth in the field od DOB as {string}")
	public void user_enters_the_date_of_birth_in_the_field_od_dob_as(String date_of_birth) {
		
		obj1.enterDOB(date_of_birth);
		
	}
	
	@Then("user enters the address as {string}")
	public void user_enters_the_address_as(String address) {
		
		obj1.enterAddress(address);
	}

	@Then("user enters the city name as {string}")
	public void user_enters_the_city_name_as(String city) {
		obj1.enterCity(city);

	}

	@Then("user enters the state name as {string}")
	public void user_enters_the_state_name_as(String state) {
		obj1.enterState(state);

	}

	@Then("user enters the pin as {string}")
	public void user_enters_the_pin_as(String pin) {
		obj1.enterPinNumber(pin);

	}

	@Then("user enters the mobile number as {string}")
	public void user_enters_the_mobile_number_as(String mobile_number) {
		obj1.enterMobileNumber(mobile_number);

	}

	@Then("user enters the email id as {string}")
	public void user_enters_the_email_id_as(String email_id) {
		obj1.enterEmailID(email_id);

	}

	@Then("user enters the password1 as {string}")
	public void user_enters_the_password1_as(String password1) {
		obj1.enterPassword1(password1);

	}

	@Then("user clicks on submit")
	public void user_clicks_on_submit() {
		obj1.clickSubmit();
		addImplicitWait();

	}
	
	@Then("user copys the CustomerID from the Registration successful page")
	public void user_copys_the_customer_id_from_the_registration_successful_page() {
	obj1.getCusID(constants.CustomerID);	
	}
	@Then("user clicks on Edit Customer link")
	public void user_clicks_on_edit_customer_link() {
     obj2.clickeditcust();
	}
	@Then("user enters the copied CustomerID in the field")
	public void user_enters_the_copied_customer_id_in_the_field() {
		obj2.pastecustid(constants.CustomerID);
	}
	@Then("user clicks on submit CustomerID")
	public void user_clicks_on_submit_customer_id() {
		obj2.clickeAccSubmit();
	}
	
	@Then("user updates the Address")
	public void user_updates_the_address() {
obj2.updateadd();
addImplicitWait();
	}

	@Then("user update the pincode")
	public void user_update_the_pincode() {
obj2.updatePinNumber();
addImplicitWait();
	}

	@Then("user clicks on submitchanges")
	public void user_clicks_on_submitchanges() {
obj2.clickeUpdateSubmit();
addImplicitWait();

	}

	@Then("clicks on New Account creation")
	public void clicks_on_new_account_creation() {
		clickBack();
		clickBack();
		addImplicitWait();
obj2.clickNewAccount();
	}


	@Then("enters the copied Customer ID")
	public void enters_the_copied_customer_id() {
		obj2.addCustID(constants.CustomerID);
	}

	@Then("enters the amount in initial deposit amount field as {string}")
	public void enters_the_amount_in_initial_deposit_amount_field_as(String amount) {
obj2.addInitialDeposit(amount);

	}

	@Then("clicks on create account")
	public void clicks_on_create_account() throws IOException {

		obj2.clickcreateAcc();
		addImplicitWait();
		TakeScreenshot();
	}

	
	
	@Then("user completes the execution")
	public void user_completes_the_execution() {
		
		addImplicitWait();
		 closeDriver();
		
	}
}
