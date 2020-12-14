Feature: To test the calendar module
Background: To login to the app
Given user opens the url
Then user clicks login btn
Then enters username and password
Then click submit btn

Scenario Outline: To add new calendars
Given user is logged into the application
When user opens calendar
And user clicks new calendar
And user fills the form with "<title>" "<calendar>" "<startDate>"
And click on save btn
Then new calendar event should be saved
Then user takes a screenshot

Examples:
|title|calendar|startDate|
|Framework10|smoke||15/12/2020 20:00|
|Framework11|sanity|18/12/2020 20:00|








