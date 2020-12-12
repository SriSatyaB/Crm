Feature: To test the crm application Login
Scenario Outline: To test the crm Login Functionality for Valid User
Given user enters the url 
Then user clicks on the login button
When user enters "<email>" and "<password>"
Then user clicks on the submit button
Then user should be launched on the home page
Then user verify the username
Then logout from the application 
Then close the browser

 Examples:
 |email|password|
 |pdeep.nov20@mail.com|Satya@123|
 
 Scenario Outline: To test the crm Login Functionality for InValid User
Given user enters the url 
Then user clicks on the login button
When user enters invalid "<email>" and invalid "<password>"
Then user clicks on the submit button
Then invalid credentials message is displayed 
Then close the browser

Examples:
|email|password|
|sri@gmail.com|Sri123|