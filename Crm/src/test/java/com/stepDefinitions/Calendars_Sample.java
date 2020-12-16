package com.stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import com.baseClasses.Library;
import com.pages.Crm_CalendarPage;
import com.pages.Crm_LoginPage;
import com.reusableFunctions.SeleniumUtilities;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Calendars_Sample extends Library {
	Crm_CalendarPage cp1;
	Crm_LoginPage lp;

	@Given("user opens the url")
	public void user_opens_the_url() {
		//browserSetUp();
	}

	@Then("user clicks login btn")
	public void user_clicks_login_btn() {
		lp = new Crm_LoginPage(driver);
		lp.clickOnLoginBtn();
	}

	@Then("enters username and password")
	public void enters_username_and_password() {
		lp.enterCredentials(properties.getProperty("email"), properties.getProperty("password"));
	}

	@Then("click submit btn")
	public void click_submit_btn() {
		lp.clickOnSubmitBtn();
	}

	@Given("user logged in the crm application")
	public void user_logged_in_the_crm_application() {

	}

	@When("user opens calendar")
	public void user_opens_calendar() {
		cp1 = new Crm_CalendarPage(driver);
		cp1.clickOnCalIcon();
	}

	@When("user clicks new calendar")
	public void user_clicks_new_calendar() {
		cp1.clickOnNewBtn();
	}

	@When("user fills the form with")
	public void user_fills_the_form_with(DataTable dataTable) throws Exception {

		for (Map<String, String> data : dataTable.asMaps()) {
			cp1.enterTitle(data.get("title"));
			cp1.enterNewCalendarName(data.get("calendar"));
			cp1.enterStartDate(data.get("startDate"));
			cp1.selectCategory(data.get("category"));
			cp1.enterDescription(data.get("Description"));
			cp1.enterLocation(data.get("Location"));
			if (data.get("AllDay").equals("Yes"))
				cp1.clickOnAllDay();
			String allTags = data.get("Tags");
			String[] a = allTags.split(",");
			for (int i = 0; i < a.length; i++) {
				cp1.enterTagValue(a[i]);
			}
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1000)");
			cp1.enterDeals(data.get("Deals"));
			cp1.addTask(data.get("Tasks"));
			cp1.selectAlertTime(data.get("AlertTime"));
			cp1.clickOnSaveBtn();
			String tt = cp1.getEventTitle();
			Assert.assertEquals("There is a problem occured in creating new Event",data.get("title"),tt);
			Thread.sleep(1000);
			cp1.clickOnCalIcon();
			Thread.sleep(1000);
			cp1.clickOnNewBtn();

		}

	}

	@When("click on save btn")
	public void click_on_save_btn() {

	}

	@Then("new calendar event should be saved")
	public void new_calendar_event_should_be_saved() {

	}

	@Then("user logouts from the application")
	public void user_logouts_from_the_application() {

	}
	
	@Given("user is logged in to the application")
	public void user_is_logged_in_to_the_application() {
	    
	}

	@When("user click on a Date")
	public void user_click_on_a_Date() {
	    
	}

	@Then("the events created on that date should be displayed")
	public void the_events_created_on_that_date_should_be_displayed() {
	    
	}

	@When("user clicks on an event")
	public void user_clicks_on_an_event() {
	    
	}

	@Then("event details are displayed")
	public void event_details_are_displayed() {
	    
	}

	@Then("user cliks on delete button")
	public void user_cliks_on_delete_button() {
	}

}
