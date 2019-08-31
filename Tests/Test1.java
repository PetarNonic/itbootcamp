package zavrsniRad.Tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import zavrsniRad.PageURLs;
import zavrsniRad.NavigationMenu.HiddenPart;
import zavrsniRad.NavigationMenu.IconsPart;
import zavrsniRad.NavigationMenu.PageLinks;
import zavrsniRad.Pages.ContactPage;
import zavrsniRad.Pages.InternetArchiveFloater;
import zavrsniRad.Pages.MainPage;

public class Test1 {

	public static final String SEARCH_TERM = "items";
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver", 
				"D:\\Download\\IT bootcamp\\Predavanja\\Automatsko testiranje\\Selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@Test
	public void Test1() {
		driver.navigate().to(PageURLs.ARCHIVE_HOME_PAGE);
		Assert.assertTrue(new MainPage(driver).getTopCollections().size()>20);
		
		List<WebElement> text = driver.findElements(By.cssSelector("div.item-ia.collection-ia"));
		for(WebElement i: text) {
			System.out.println(i.getText());
			Assert.assertTrue(i.getText().toLowerCase().contains("items"));
		}
	}
}
