Feature: feature to test the login of actiTime application

  Scenario Outline: scenarion to test the actiTime application
    Given userA is on chrome browser
    When userA enters the url of actitime application
    And userA hits on enters button actiTime application
    Then userA should see username and password textboxes of actiTime application
    When userA enters "<username>" and "<password>"
    And  userA hits on login button of actiTime application

    Examples: 
      | username | password |
      | admin    | manager  |
