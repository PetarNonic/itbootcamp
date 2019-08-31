package zavrsniRad.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import zavrsniRad.PageURLs;
import zavrsniRad.NavigationMenu.IconsPart;
import zavrsniRad.Pages.LoginPage;

public class Test7 {

	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver", 
				"D:\\Download\\IT bootcamp\\Predavanja\\Automatsko testiranje\\Selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@Test
	public void Test7() throws InterruptedException {
		String search = "terms";
		driver.navigate().to(PageURLs.ARCHIVE_HOME_PAGE);
		new IconsPart(driver).clickSignInIcon();
		Assert.assertTrue(new LoginPage(driver).getForgotPasswordLink().isDisplayed());
		new LoginPage(driver).clickSignupLink();
		new LoginPage(driver).clickOnTermOfConditions();
		Thread.sleep(3000);
		new LoginPage(driver).switchToNextWindow();
		Assert.assertTrue(driver.getCurrentUrl().contains(search));
	}
}
