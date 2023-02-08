package stepDefinations;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LinkCountValidationHome;
import pageObjects.LinkCountValidationUITAP;
import pageObjects.PageObjectManager;
import utills.TestContextSetup;

public class LinkCountValidationStep {
	public WebDriver driver;
	PageObjectManager pageObjectManager;
	public int countUit;
	public int countH;

	public TestContextSetup testcontextsetup;

	public LinkCountValidationStep(TestContextSetup testcontextsetup) {
		this.testcontextsetup = testcontextsetup;
	}

	@Given("User is available on UI Test Automation landing page")
	public void user_is_available_on_ui_test_automation_landing_page() {

	}

	@When("User clicks on UITAP tab")
	public void user_clicks_on_uitap_tab() throws InterruptedException {
		LinkCountValidationUITAP linkCountValidation = testcontextsetup.pageObjectManager.getUITAP();
		linkCountValidation.click_On_UITAP_Tab();
		Thread.sleep(2000);
		countUit = linkCountValidation.UITAP_link_count();
		System.out.println("Links Count in UITAP tab" + " " + countUit);
	}

	@When("User clicks on Home tab")
	public void user_clicks_on_home_tab() {
		LinkCountValidationHome linkcountValidationH = testcontextsetup.pageObjectManager.getHome();
		linkcountValidationH.click_On_Home_Tab();
		countH = linkcountValidationH.Home_link_count();
		System.out.println("Links Count in Home tab" + " " + countH);

	}

	@Then("Links available in UITAP tab and Home tab shiuld have the same count.")
	public void links_available_in_uitap_tab_and_home_tab_shiuld_have_the_same_count() {
		Assert.assertEquals(countUit, countH);
	}

}
