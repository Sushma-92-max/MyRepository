@regression
Feature: New Customer Creation

  Background: 
    Given user loads the URL in the Browser
    And user enters the username in the uname field as "mngr616204"
    And user enters the password in the password field as "yzAsUpE"
    When user clicks on the login button in application
    Then the user will be navigated to Guru99 demo applications homepage

  Scenario Outline: Creating New customer with all details
    And user clicks on New Customer Creation link in the demoguru app
    And user enters the Customer name in the app as "<customer_name>"
    And user selects the gender
    And user enters the date of birth in the field od DOB as "<date_of_birth>"
    And user enters the address as "<address>"
    And user enters the city name as "<city>"
    And user enters the state name as "<state>"
    And user enters the pin as "<pin>"
    And user enters the mobile number as "<mobile_number>"
    And user enters the email id as "<email_id>"
    And user enters the password1 as "<password1>"
    And user clicks on submit
    And user copys the CustomerID from the Registration successful page
    And user completes the execution

    Examples: 
      | customer_name | date_of_birth | address                | city | state       | pin    | mobile_number | email_id         | password1 |  |
      | TOMS           | 06-08-1988    | 3rd Cross Panday Nagar | Pune | Maharashtra | 400056 |    8007200270 | toms@gmail.com | toms@1234  |  |
