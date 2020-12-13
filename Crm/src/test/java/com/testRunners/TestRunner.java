package com.testRunners;



import com.vimalselvam.cucumber.listener.Reporter;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Features",
				plugin = {"pretty",
						"html:Reports/cucumber-html-report", 
						"json:Reports/cucumber-html-report/jsonreport.json",
						"rerun:target/cucumber-reports/rerun.txt",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
						//"testng:target/testng-cucumber-reports/cuketestng.xml",
						},
				dryRun=false,//if true tests cases will not run
				strict=true,
				monochrome= true,//for better console output
		glue= {"com.stepDefinitions"}
		
		
		//strict= true
					
		)
public class TestRunner extends AbstractTestNGCucumberTests {
	 public static void Extentsreport()
	  
	  {
	  Reporter.loadXMLConfig("/src/test/resources/Extent-config.xml");
	  Reporter.setSystemInfo("user", System.getProperty("user.name"));
	  Reporter.setSystemInfo("os", "Windows");
	  Reporter.setTestRunnerOutput("Project Natural Report"); }

}

