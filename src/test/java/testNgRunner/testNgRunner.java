package testNgRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features", glue = "stepDefinations", monochrome = true,plugin = {
		"html:target/cucumber.html", "json:target/cucmber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","rerun:target/FailedScenarios/failed.txt"})
public class testNgRunner extends AbstractTestNGCucumberTests {
	
}