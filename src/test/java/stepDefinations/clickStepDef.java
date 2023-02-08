package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.PageObjectManager;
import pageObjects.click;
import utills.TestContextSetup;


public class clickStepDef 
{
	PageObjectManager pageObjectManager;
	public TestContextSetup testcontextsetup;

	public clickStepDef(TestContextSetup testcontextsetup) {
		this.testcontextsetup = testcontextsetup;
	}
	
	@Given("User should be available on click page.")
	public void user_should_be_available_on_click_page() 
	{
	
		click clickv=testcontextsetup.pageObjectManager.clickOperation();
		clickv.clickPage();
		
	}
	@When("User clicks on butto which available under Playground header")
	public void user_clicks_on_butto_which_available_under_playground_header()
	{
		click clickv=testcontextsetup.pageObjectManager.clickOperation();
		clickv.clickOnbutton();
		
	}
	@Then("button colour becomes green")
	public void button_colour_becomes_green()
	{
		click clickv=testcontextsetup.pageObjectManager.clickOperation();
		clickv.ButtonValidation();
		
	}

}
