Feature: To test the crm application calendar 
Background: To login to the crm application
Given user enters the crm  url
Then user clicks on  login button
When user enters email and password
And  user clicks on  submit button
Then user navigates to the home page


Scenario: To test the crm calendar functionality
Given user is logged into the application
Then user clicks on the calendar icon
When user clicks on the new button
Then new event form is opened
Then user enters "Framework3" in title 
Then user enters a  calendar
Then user enters "15/12/2020 20:00" as startdate
Then user enters "16/12/2020 20:00" as enddate
Then user enters "This is my first test calendar" in description
Then user enters "Ca office" in location
Then user selects "Important" in category
Then user enters tags
|satya|
Then user enters deals
|deals2|
Then user enters "case1" in case
Then user checks the allDay toggle
Then user enters a task
|task6|
Then user selects "30 Minutes" as alert time
Then user enters company as "Agama"
Then user clicks on the save Btn

