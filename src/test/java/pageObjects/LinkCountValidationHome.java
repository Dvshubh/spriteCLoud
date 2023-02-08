package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkCountValidationHome {

	public WebDriver driver;

	public LinkCountValidationHome(WebDriver driver) {
		this.driver = driver;
	}

	By Home = By.xpath("//a[contains(text(),'Home')]");
	By HomeLinks = By.xpath("//*[@class='col-sm']/h3");

	public void click_On_Home_Tab() 
	{
		driver.findElement(Home).click();
	}

	public int Home_link_count() 
	{
		List<WebElement> countHome = driver.findElements(HomeLinks);
		return countHome.size();

	}

}
