package zavrsniRad.Tests;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import zavrsniRad.NavigationMenu.IconsPart;
import zavrsniRad.Pages.LoginPage;

public class Test6 {

	WebDriver driver;

	public static final String EMAIL = "foo@gmail.com";
	public static final String PASSWORD = "bar";

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver", 
				"D:\\Download\\IT bootcamp\\Predavanja\\Automatsko testiranje\\Selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

	@Test
	public void Test6() {

		// Test 6

		driver.navigate().to(zavrsniRad.PageURLs.ARCHIVE_HOME_PAGE);
		new IconsPart(driver).clickSignInIcon();
		Assert.assertTrue(new LoginPage(driver).getLoginButton().isDisplayed());
		new LoginPage(driver).sendTextToEmailBox(EMAIL);
		new LoginPage(driver).sendTextToPasswordBox(PASSWORD);
		new LoginPage(driver).clickLoginButton();
		Assert.assertTrue(new LoginPage(driver).getErrorMessage().isDisplayed());
	}
}