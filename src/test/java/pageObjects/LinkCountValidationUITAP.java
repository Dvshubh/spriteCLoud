package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkCountValidationUITAP {

	public WebDriver driver;

	public LinkCountValidationUITAP(WebDriver driver) {
		this.driver = driver;
	}

	By UITAP = By.xpath("//a[contains(text(),'UITAP')]");
	By UITAPLinks = By.xpath("//*[@class='col-sm']/h3");

	public void click_On_UITAP_Tab() 
	{
		driver.findElement(UITAP).click();
	}

	public int UITAP_link_count() 
	{
		List<WebElement> count = driver.findElements(UITAPLinks);
		return count.size();

	}

}
