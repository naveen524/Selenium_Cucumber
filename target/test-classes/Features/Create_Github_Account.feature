Feature: feature to test create an account of github

  Scenario Outline: scenario to test create an account of github
    Given user is on chrome browser of git-hub
    When user enters the url of  git-hub for creating an account
    Then user should see the sign-in button of git-hub
    When user clicks on sign-up button of git-hub

    Examples: 
      | username  | password            |
      | naveen524 | naveen_manneela@143 |
