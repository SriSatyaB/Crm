$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/crm_calendar.feature");
formatter.feature({
  "name": "To test the crm application calendar",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "To login to the crm application",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user enters the crm  url",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepDefinitions.Crm_Calendar.user_enters_the_crm_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on  login button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitions.Crm_Calendar.user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters email and password",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepDefinitions.Crm_Calendar.user_enters_email_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on  submit button",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepDefinitions.Crm_Calendar.user_clicks_on_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitions.Crm_Calendar.user_navigates_to_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To test the crm calendar functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is logged into the application",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepDefinitions.Crm_Calendar.user_is_logged_into_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the calendar icon",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitions.Crm_Calendar.user_clicks_on_the_calendar_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the new button",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepDefinitions.Crm_Calendar.user_clicks_on_the_new_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "new event form is opened",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitions.Crm_Calendar.new_event_form_is_opened()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"Framework5\" in title",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitions.Crm_Calendar.user_enters_in_title(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters a  calendar",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitions.Crm_Calendar.user_enters_a_calendar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"15/12/2020 20:00\" as startdate",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitions.Crm_Calendar.user_enters_as_startdate(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"16/12/2020 20:00\" as enddate",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitions.Crm_Calendar.user_enters_as_enddate(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"This is my first test calendar\" in description",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitions.Crm_Calendar.user_enters_in_description(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"Ca office\" in location",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitions.Crm_Calendar.user_enters_in_location(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects \"Important\" in category",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitions.Crm_Calendar.user_selects_in_category(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters one or more  tags",
  "rows": [
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitions.Crm_Calendar.user_enters_one_or_more_tags(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters one or more deals",
  "rows": [
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitions.Crm_Calendar.user_enters_one_or_more_deals(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"case1\" in case",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitions.Crm_Calendar.user_enters_in_case(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user checks the allDay toggle",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitions.Crm_Calendar.user_checks_the_allDay_toggle()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters one or more tasks",
  "rows": [
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitions.Crm_Calendar.user_enters_one_or_more_tasks(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects \"30 Minutes\" as alert time",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitions.Crm_Calendar.user_selects_as_alert_time(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters company as \"Agama\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitions.Crm_Calendar.user_enters_company_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the save Btn",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitions.Crm_Calendar.user_clicks_on_the_save_Btn()"
});
formatter.result({
  "status": "passed"
});
});