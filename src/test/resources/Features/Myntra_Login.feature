Feature: feature to test the login functionality of myntra
Scenarios: test the login of myntra
Given user is on webpage 
When user enters url of myntra 
And hits enter on webpage
Then user should see the profile on webpage
When user mouseover on profile 
And clicks on login button of myntra
Then user should see login or signup with mobile number textbox 
When user enters the mobilenum 
And clicks on continue button of myntra
