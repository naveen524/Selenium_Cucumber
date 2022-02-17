Feature: feature to test the login functionality of gmail

  Scenario: test the login of gmail
    Given user is on login page of gmail
    When user clicks on login button of gmail
    Then user should see the email or textbox
    When user enters gmail_id
    And clicks on next button of gmail
    Then user should see the enter your password textbox
    When user enters the password of gmail
    And clicks on next button of the gmail
    Then user should see the homepage of gmail
