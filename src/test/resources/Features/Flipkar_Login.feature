Feature: feature to test the login functionality of flipkart

  Scenario: test the login of flipkart
    Given user is on browser of flipkart
    When user enters url of flipkart
    Then user should see email or mobilenum and enter password textboxes
    When user enters "<username>" and "<password>" of flipkart
    And cliks on on login button of flipkart
    Then user should see the homepage of flipkart application
    When user mouseover on fashion
    And clicks on mens foot wear
    Then user should see the foot wear products
    When user clicks on liked product
    Then click on size of the shoes
    And clicks on add to cart
    Then user should see the place order button
    When user clicks on place order
    And clicks on delivery here
