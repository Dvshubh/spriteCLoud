package utills;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TestContextSetup {
	public WebDriver driver;
	public String landingPageProductName;
	// public String offersPageProductName;
	public PageObjectManager pageObjectManager;
	public TestBase testbase;

	public TestContextSetup() throws IOException {
		testbase = new TestBase();
		pageObjectManager = new PageObjectManager(testbase.webDriverManager());
		
	}
}
