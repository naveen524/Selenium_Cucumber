Feature: feature to test the login of snapdeal application
Scenario: test the login of snapdeal
Given user is on browser of snapdeal
When user enters the url of snapdeal
And hits the enter on browser of snapdeal
Then user should see the sign-in page of snapdeal
When user mouseover on sign-in of snapdeal
And clicks on login
Then user should see mobilenum or email textbox
When user enters the email

