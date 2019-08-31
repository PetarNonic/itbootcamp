package zavrsniRad.Tests;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import zavrsniRad.PageURLs;
import zavrsniRad.Pages.InternetArchiveFloater;
import zavrsniRad.Pages.MainPage;

public class Test2 {

	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver", 
				"D:\\Download\\IT bootcamp\\Predavanja\\Automatsko testiranje\\Selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@Test
	public void Test2() {
		driver.navigate().to(PageURLs.ARCHIVE_HOME_PAGE);
		List<WebElement> collections = new InternetArchiveFloater(driver).getNumberOfItems();
		WebElement number = collections.get(0);
		String[] views1 = number.getText().split("[\\n]");
		System.out.println(views1[0]);

		new MainPage(driver).clickOnTopCollectionItem(0);
		WebElement results = new MainPage(driver).resultNumbers();
		String[] views2 = results.getText().split("[\\s]");
		System.out.println(views2[0]);
		Assert.assertFalse(views2[0].equals(views1[0]), "Results are not the same.");
	}
}