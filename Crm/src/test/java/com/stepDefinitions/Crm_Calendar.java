package com.stepDefinitions;

import java.util.List;

import com.baseClasses.Library;
import com.pages.Crm_CalendarPage;
import com.pages.Crm_LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Crm_Calendar extends Library {
	Crm_LoginPage lp;
	Crm_CalendarPage cp;

	@Given("user enters the crm  url")
	public void user_enters_the_crm_url() {
		browserSetUp();
	}

	@Then("user clicks on  login button")
	public void user_clicks_on_login_button() {
		lp= new Crm_LoginPage(driver);
		lp.clickOnLoginBtn();
	}

	@When("user enters email and password")
	public void user_enters_email_and_password() {
		lp.enterCredentials(properties.getProperty("email"), properties.getProperty("password"));

	}
	
	@Then("user clicks on  submit button")
	public void user_clicks_on_submit_button() {
	   lp.clickOnSubmitBtn();
	}

	@Then("user navigates to the home page")
	public void user_navigates_to_the_home_page() {
		
	}

	@Given("user is logged into the application")
	public void user_is_logged_into_the_application() {
		
	}

	@Then("user clicks on the calendar icon")
	public void user_clicks_on_the_calendar_icon() {
		cp= new Crm_CalendarPage(driver);
		cp.clickOnCalIcon();
	}

	@When("user clicks on the new button")
	public void user_clicks_on_the_new_button() {
		cp.clickOnNewBtn();
	}

	@Then("new event form is opened")
	public void new_event_form_is_opened() {
		
	}

	@Then("user enters {string} in title")
	public void user_enters_in_title(String tname) {
		cp.enterTitle(tname);
	}

	/*@Then("user enters {string} as  the new calendar")
	public void user_enters_as_the_new_calendar(String cal) {
	    cp.enterNewCal(cal);
	}*/
	
	@Then("user enters a  calendar")
	public void user_enters_a_calendar() {
	    cp.enterCalendarName();
	}
	@Then("user enters {string} as startdate")
	public void user_enters_as_startdate(String startdate) {
		cp.enterStartDate(startdate);
	}

	@Then("user enters {string} as enddate")
	public void user_enters_as_enddate(String enddate) {
		//cp.enterEndDate(enddate);
	}
	@Then("user enters {string} in description")
	public void user_enters_in_description(String description) {
	   cp.enterDescription(description);
	}
	
	@Then("user enters {string} in location")
	public void user_enters_in_location(String location) {
	    cp.enterLocation(location);
	}
	@Then("user selects {string} in category")
	public void user_selects_in_category(String category) {
	   cp.selectCategory(category);
	}
	@Then("user enters tags")
	public void user_enters_tags(List<String> tags) throws Exception {
		cp.enteraTags(tags);
	    
	}
	@Then("user enters deals")
	public void user_enters_deals(List<String> deals) {
	    cp.enterDeals(deals);
	}
	
	@Then("user enters {string} in case")
	public void user_enters_in_case(String case1) {
	    cp.enterCase(case1);
	}

	@Then("user checks the allDay toggle")
	public void user_checks_the_allDay_toggle() {
	   cp.clickOnAllDay();
	}

	@Then("user enters a task")
	public void user_enters_a_task(List<String> Tname) {
	    cp.addTask(Tname);
	}

	@Then("user selects {string} as alert time")
	public void user_selects_as_alert_time(String time) {
	    cp.selectAlertTime(time);
	}
	
	

	@Then("user enters company as {string}")
	public void user_enters_company_as(String cName) {
	    cp.enterCompany(cName);
	}



	@Then("user clicks on the save Btn")
	public void user_clicks_on_the_save_Btn() {
		cp.clickOnSaveBtn();
	}

}
