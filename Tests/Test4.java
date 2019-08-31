package zavrsniRad.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import zavrsniRad.PageURLs;
import zavrsniRad.Pages.InternetArchiveFloater;

public class Test4 {

	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver", 
				"D:\\Download\\IT bootcamp\\Predavanja\\Automatsko testiranje\\Selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@Test
	public void Test4() {
		driver.navigate().to(PageURLs.ARCHIVE_HOME_PAGE);
		new InternetArchiveFloater(driver).clickIASearchBox();
		new InternetArchiveFloater(driver).sendTextIASearchBox("qa");
		new InternetArchiveFloater(driver).clickIAGoButton();
		String text = "?query=qa";
        Assert.assertTrue(driver.getCurrentUrl().contains(text));
	}
}