Feature: feature to test the login of facebook

  Scenario Outline: scenario to test the login functionality of facebook
    Given user is on chrome bowser of facebook
    When user enters the url of facebook
    Then user should see the username and password textboxes of facebook
    When user enters the "<username>" and "<password>"
    And clicks on login button of facebook
    Then user should see the homepage of facebook
    Then user should see the search icon
    When user enters] the username in search icon
    And clicks on user liked autosuggession
    When user clicks on photos
    Then user should see the photos
    And click on back button
    And user clicks on homepage of facebook
    Then clicks on photo/video
    And click on on post button

    Examples: 
      | username   | password     |
      | 6302707546 | Facebook@143 |
