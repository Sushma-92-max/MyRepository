@smoke
Feature: Editing existing Customer Details

  Background: 
    Given user loads the URL in the Browser
    And user enters the username in the uname field as "mngr616204"
    And user enters the password in the password field as "yzAsUpE"
    When user clicks on the login button in application
    Then the user will be navigated to Guru99 demo applications homepage
    And user clicks on New Customer Creation link in the demoguru app
    And user enters the Customer name in the app as "Asha"
    And user selects the gender
    And user enters the date of birth in the field od DOB as "09-09-1978"
    And user enters the address as "34 GT Street "
    And user enters the city name as "Pune"
    And user enters the state name as "Maharastra"
    And user enters the pin as "346899"
    And user enters the mobile number as "3332504898"
    And user enters the email id as "asha@gmail.com"
    And user enters the password1 as "asha@1234"
    And user clicks on submit
    And user copys the CustomerID from the Registration successful page

  Scenario Outline: Editing Customer Details
    And user clicks on Edit Customer link
    And user enters the copied CustomerID in the field
    And user clicks on submit CustomerID
    And user updates the Address
    And user update the pincode
    And user clicks on submitchanges
    And clicks on New Account creation
    And enters the copied Customer ID
    And enters the amount in initial deposit amount field as "<amount>"
    And clicks on create account

    Examples: 
      | amount |
      |   5000 |
