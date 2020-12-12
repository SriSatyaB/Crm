$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/crm_login.feature");
formatter.feature({
  "name": "To test the crm application Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "To test the crm Login Functionality for Valid User",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user enters the url",
  "keyword": "Given "
});
formatter.step({
  "name": "user clicks on the login button",
  "keyword": "Then "
});
formatter.step({
  "name": "user enters \"\u003cemail\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user clicks on the submit button",
  "keyword": "Then "
});
formatter.step({
  "name": "user should be launched on the home page",
  "keyword": "Then "
});
formatter.step({
  "name": "user verify the username",
  "keyword": "Then "
});
formatter.step({
  "name": "logout from the application",
  "keyword": "Then "
});
formatter.step({
  "name": "close the browser",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "pdeep.nov20@mail.com",
        "Satya@123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To test the crm Login Functionality for Valid User",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user enters the url",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepDefinitions.Crm_LoginSteps.user_enters_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the login button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitions.Crm_LoginSteps.user_clicks_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"pdeep.nov20@mail.com\" and \"Satya@123\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepDefinitions.Crm_LoginSteps.user_enters_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitions.Crm_LoginSteps.user_clicks_on_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be launched on the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitions.Crm_LoginSteps.user_should_be_launched_on_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verify the username",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitions.Crm_LoginSteps.user_verify_the_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "logout from the application",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitions.Crm_LoginSteps.logout_from_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitions.Crm_LoginSteps.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "To test the crm Login Functionality for InValid User",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user enters the url",
  "keyword": "Given "
});
formatter.step({
  "name": "user clicks on the login button",
  "keyword": "Then "
});
formatter.step({
  "name": "user enters invalid \"\u003cemail\u003e\" and invalid \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user clicks on the submit button",
  "keyword": "Then "
});
formatter.step({
  "name": "invalid credentials message is displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "close the browser",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "sri@gmail.com",
        "Sri123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To test the crm Login Functionality for InValid User",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user enters the url",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepDefinitions.Crm_LoginSteps.user_enters_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the login button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitions.Crm_LoginSteps.user_clicks_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters invalid \"sri@gmail.com\" and invalid \"Sri123\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepDefinitions.Crm_LoginSteps.user_enters_invalid_and_invalid(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitions.Crm_LoginSteps.user_clicks_on_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "invalid credentials message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitions.Crm_LoginSteps.invalid_credentials_message_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinitions.Crm_LoginSteps.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});