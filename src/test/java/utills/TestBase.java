
package utills;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.*;

public class TestBase {
	public WebDriver driver;

	public WebDriver webDriverManager() throws IOException {
		
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String projectUrl=prop.getProperty("qAUrl");

		if (driver == null) {

			if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
				
			
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"//src//test//resources//chromedriver.exe");

			driver = new ChromeDriver(); // driver gets the life here
			}
			/*
			if (prop.getProperty("browser").equalsIgnoreCase("chrome"))
			{
				System.out.println("FirefoxBrowser");
			}
			*/
			driver.manage().window().maximize();
			driver.get(projectUrl);
		}

		return driver;

	}

}
