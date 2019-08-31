package zavrsniRad.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import zavrsniRad.PageURLs;
import zavrsniRad.NavigationMenu.HiddenPart;
import zavrsniRad.NavigationMenu.IconsPart;
import zavrsniRad.Pages.InternetArchiveFloater;

public class Test3 {

	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver", 
				"D:\\Download\\IT bootcamp\\Predavanja\\Automatsko testiranje\\Selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@Test
	public void Test3() {
		driver.navigate().to(PageURLs.ARCHIVE_HOME_PAGE);
		new IconsPart(driver).clickTextsIcon();
		new HiddenPart(driver).clickFeaturedListTexts(0);
		String url1 = driver.getCurrentUrl();
		new IconsPart(driver).clickLogoIcon();
		new InternetArchiveFloater(driver).clickIATextsIcon();
		Assert.assertTrue(driver.getCurrentUrl().equals(url1));
	}
}