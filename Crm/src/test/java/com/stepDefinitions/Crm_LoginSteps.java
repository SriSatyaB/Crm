package com.stepDefinitions;



import org.testng.Assert;

import com.baseClasses.Library;
import com.pages.Crm_LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Crm_LoginSteps extends Library {
	Crm_LoginPage lp;

	@Given("user enters the url")
	public void user_enters_the_url() {
		browserSetUp();
	}

	@Then("user clicks on the login button")
	public void user_clicks_on_the_login_button() {
		lp = new Crm_LoginPage(driver);
		lp.clickOnLoginBtn();
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String email, String password) {
		lp.enterCredentials(email, password);
	}

	@Then("user clicks on the submit button")
	public void user_clicks_on_the_submit_button() {
		lp.clickOnSubmitBtn();
	}

	@Then("user should be launched on the home page")
	public void user_should_be_launched_on_the_home_page() {

	}

	@Then("user verify the username")
	public void user_verify_the_username() {
		String name = lp.verifyUser();
		//Assert.assertEquals(name, "Satya B");
	}

	@Then("logout from the application")
	public void logout_from_the_application() {
		lp.logout();
	}

	@Then("close the browser")
	public void close_the_browser() {
		// tearDown();
	}

	@When("user enters invalid {string} and invalid {string}")
	public void user_enters_invalid_and_invalid(String email, String password) {
		lp.enterCredentials(email, password);
	}

	@Then("invalid credentials message is displayed")
	public void invalid_credentials_message_is_displayed() {
		String msg = lp.verifyInvalidUser();
		Assert.assertEquals(msg, "Invalid login");
	}

}
