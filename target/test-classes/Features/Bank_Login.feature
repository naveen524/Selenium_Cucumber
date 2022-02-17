Feature: feature to test the login of guru bank

  Scenario Outline: scenario to test the login of guru bank
    Given user is on chrome browser of guru bank
    When user enters the url of guru banks
    And hits enters on browser guru bank url
    Then user should see the username and password textboxes of guru bank
    When users enters "<UserName>" and "<Password>"
    And clicks on login of guru bank
    Then user should see the home page of guru bank

    Examples: 
      | UserName   | Password      |
      | mngr386116 | Gurubank@1234 |

  #User ID :	mngr377966
  #Password :	Gurubank@143
  #User ID :	mngr386116
  #Password :	Gurubank@1234
  
  
  @Fund_Transfer
  Scenario: scenario to test the fund transfer
    Given user on fund transfer page
    When user clicks on fund transfer page
    Then user should see the Payers account no,Payees account no,Amount and Description textboxes
    When user enters Payers account no,Payees account no,Amount and Description
    And clicks on submit button of fund transfer
    Then clicks on backward button
    And clicks on refresh button

  @New_Account
  Scenario: scenario to test the New_Account
    Given user is on New _Account page
    When user clicks on New_Account
    Then user should see the Customer id,Account type and Initial deposit	textboxes
    When user enters Customer id,Account type and Initial deposit	textboxes
    And clicks on submit button of New_Account
    Then user should get msg as account created successfully

  @Deposite
  Scenario: scenario to test the deposite
    Given user is on deposite page
    When user clicks on deposite button
    Then user should see the Account No,Amount and Description
    When user enters Account No,Amount and Description
    And clicks on submit button of deposite
    Then user get msg as amount deposited successfully
