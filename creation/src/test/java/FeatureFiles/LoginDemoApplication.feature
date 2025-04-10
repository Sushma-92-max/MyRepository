@sanity

Feature: Login for Guru99 Demo Application

  Scenario Outline: To Validate login for Guru99 Demo Application
    Given user loads the URL in the Browser
    And user enters the username in the uname field as "<username>"
    And user enters the password in the password field as "<password>"
    When user clicks on the login button in application
    Then the user will be navigated to Guru99 demo applications homepage
    And user completes the execution

    Examples: 
      | username   | password |
      | mngr616204 | yzAsUpE  |
