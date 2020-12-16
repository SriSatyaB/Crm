@FunctionalTest
Feature: To test the calendar module 
Background: To login to the app 
	Given user opens the url 
	Then user clicks login btn 
	Then enters username and password 
	Then click submit btn 
	
@SmokeTest	
Scenario: To add one or more new calendars 
	Given user logged in the crm application 
	When user opens calendar 
	And user clicks new calendar 
	And user fills the form with 
		|title      |calendar|startDate       |Description           |Location |AllDay|category |Tags          |Deals |Cases |Tasks|AlertTime |AlertVia|ReminderTime|AssignedTo   |Participants|Company |screenshot|
		|abcde      |cal3.6   |17/12/2020 20:00|This is my first event|ca office|Yes   |Important|tag1,tag2,tag3|deals1|cases1|task1|30 Minutes|Email   |10 minutes  |Satya Bolloju|satya       |Aagama |screenshot1.png|
		#|Framework35|cal3.5   |19/12/2020 20:00|This is my first event|ca office|Yes   |Important|tag4,tag5,tag6|deals1|cases1|task1|30 Minutes|Email   |10 minutes  |Satya Bolloju|satya       |Aagama |screenshot2.png|
	And click on save btn 
	Then new calendar event should be saved 
	Then user logouts from the application 
	
@RegressionTest
Scenario: To delete a calendar event
	Given user is logged in to the application
	When user click on a Date
	Then the events created on that date should be displayed
	When user clicks on an event
	Then event details are displayed
	Then user cliks on delete button
	
	
	
	
	
	
	
	
	
	
	
	
