package StepDefinition2;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(       //src/test/java/MyFeatureFiles/ - if we want to execute all feature files
		//src/test/java/MyFeatureFiles/Mytest1.feature - if we want to execute specific feature file
	features="src/test/java/FeatureFiles/",
	glue={"StepDefinition2"},
	tags="@smoke",//@sanity 1st feature file @regression 2nd feature file
    dryRun=false,	//dryRun=true,
	monochrome=false,
	plugin= {"pretty","html:target/HtmlReport/index1.html",
			
			"json:target/CucumberReports/cucumber.json",
			
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		
		)
public class testrunner {

}
