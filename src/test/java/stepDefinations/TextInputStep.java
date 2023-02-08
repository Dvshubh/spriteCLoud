package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.PageObjectManager;
import pageObjects.TextInput;
import utills.TestContextSetup;

public class TextInputStep {
	public TestContextSetup testcontextsetup;
	public WebDriver driver;
	PageObjectManager pageObjectManager;
	

	public TextInputStep(TestContextSetup testcontextsetup) {
		this.testcontextsetup = testcontextsetup;
	}

	@Given("button name is changing as per the Input value")
	public void button_name_is_changing_as_per_the_input_value() throws InterruptedException {
		TextInput textInput = testcontextsetup.pageObjectManager.getTextInput();
		textInput.textInputPage();
		Thread.sleep(2000);

	}


	@When("when user clicks on button after entering the {string} in textbox")
	public void when_user_clicks_on_button_after_entering_the_in_textbox(String value) throws InterruptedException
	{
		TextInput textInput = testcontextsetup.pageObjectManager.getTextInput();
		textInput.textInputOperation(value);
		
		
	}

	@Then("button name should match with value available in textbox")
	public void button_name_should_match_with_value_available_in_textbox() {
		TextInput textInput = testcontextsetup.pageObjectManager.getTextInput();
		System.out.println("Button Value" + " " + textInput.ButtonValue());
		
		Assert.assertEquals(textInput.ButtonValue(), "Shubhranshu Singh");
	}
}
