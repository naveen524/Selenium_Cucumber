Feature: feature to test the login of product store

  Scenario Outline: test the login of product store
    Given user is on webbrowser
    When user enters the url of products store
    Then user should see the login or signup button of products store
    When user clicks on login button of products store
    Then user should see the username and password textboxes of products store
    When user enters "<userName>" and "<Password>"
    And clicks on login button of products store
    Then user should see the homepage of products store
    When user clicks on phones
    Then user should see the Iphone
    When user clicks on Iphone
    Then user should see the add to cart button
    And user clicks on cart of products store
    Then user should see the place order button of products store
    When user clicks on place order button of products store
    Then user should textboxes like name,contry,city textboxes of products store

    Examples: 
      | userName                 | Password          |
      | naveenmanneela@gmail.com | ProductStore@1234 |
