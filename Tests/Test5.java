package zavrsniRad.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import zavrsniRad.PageURLs;
import zavrsniRad.NavigationMenu.IconsPart;

public class Test5 {

	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver", 
				"D:\\Download\\IT bootcamp\\Predavanja\\Automatsko testiranje\\Selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@Test
	public void Test5() {
		driver.navigate().to(PageURLs.ARCHIVE_HOME_PAGE);
		new IconsPart(driver).clickUploadIcon();
        String pageSource = driver.getPageSource();
        Assert.assertTrue(pageSource.contains("Log in"));
        Assert.assertTrue(pageSource.contains("Sign up"));
	}
}
