package stepDefinations;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.github.dockerjava.api.model.Driver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utills.TestContextSetup;

public class Hooks

{
	public TestContextSetup testcontextsetup;

	public Hooks(TestContextSetup testcontextsetup) {
		this.testcontextsetup = testcontextsetup;
	}

	@After
	public void afterScenario() throws IOException {
		testcontextsetup.testbase.webDriverManager().quit();
	}
	
	@AfterStep
	public void addScreenshots(Scenario scenario) throws IOException
	{
		WebDriver driver=testcontextsetup.testbase.webDriverManager();
		if (scenario.isFailed()) 
			
		{
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[]fileContent=FileUtils.readFileToByteArray(src);
			scenario.attach(fileContent, "image/png", "image");
			
		}
	}
}
