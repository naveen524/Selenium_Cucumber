Feature: feature to test the login of godaddy

  Scenario: test the login of godaddy
    Given user is chrome browser of godaddy
    When user enters the url of godaddy
    And hits enters on godaddy
    Then user should see sign-in oage
    When user clicks on sign-in button of godaddy
    And again user should see the sign-in button
    When again user clicks on sign-in button of godaddy
    Then user should see the username or customer textbox  of godaddy
    When user enters text in username textbox
    And clicks on continue button of godaddy
    Then user should see the password textbox of godaddy
    When user enters the password of godaddy
    Then clicks on keep me sign in this device
    And clicks on sign-in button of godaddy
    Then user should see the Start Shopping button
    When user clicks on starts shopping button
    Then user should see the homepage of godaddy
