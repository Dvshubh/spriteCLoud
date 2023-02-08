package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextInput {
	public WebDriver driver;

	public TextInput(WebDriver driver) {
		this.driver = driver;
	}

	By Text_Input = By.xpath("//a[contains(text(),'Text Input')]");
	By Text_Box = By.xpath("//*[@placeholder='MyButton']");
	By button = By.xpath("//*[@id='updatingButton']");

	public void textInputPage() {
		driver.findElement(Text_Input).click();
	}

	public String textInputOperation(String value) throws InterruptedException {
		driver.findElement(Text_Box).sendKeys(value);
		

		driver.findElement(button).click();
		return value;

	}

	public String ButtonValue() {
		String buttonValue = driver.findElement(button).getText();
		return buttonValue;
	}

}
