package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class click {

	public WebDriver driver;

	public click(WebDriver driver) {
		this.driver = driver;
	}

	By clickLink = By.xpath("//a[contains(text(),'Click')]");
	By buttonClick = By.xpath("//button[@id='badButton']");

	public void clickPage() {
		driver.findElement(clickLink).click();
	}

	public void clickOnbutton() {
		driver.findElement(buttonClick).click();
	}

	public void ButtonValidation() {
		if (driver.findElement(buttonClick).getAttribute("class").contains("btn btn-success")) {
			System.out.println("Button colour has been changed to Green");
		} else {
			System.out.println("BUtton is not clicked");
		}

	}
}
