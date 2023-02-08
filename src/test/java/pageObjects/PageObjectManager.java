package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager

{
	

	public WebDriver driver;
	public LinkCountValidationUITAP linkcountValidation;
	public LinkCountValidationHome linkcountValidationH;
	public TextInput textInput;
	public click clickv;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public LinkCountValidationUITAP getUITAP() {
		linkcountValidation = new LinkCountValidationUITAP(driver);
		return linkcountValidation;

	}

	public LinkCountValidationHome getHome() {
		linkcountValidationH = new LinkCountValidationHome(driver);
		return linkcountValidationH;
	}
	
	public TextInput getTextInput()
	{
		textInput=new TextInput(driver);
		return textInput;
	}
	public click clickOperation()
	{
		clickv=new click(driver);
		return clickv;
	}

}
