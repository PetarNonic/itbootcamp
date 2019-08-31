package zavrsniRad.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactPage {

	static WebDriver driver;
	
	public ContactPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Elements
	
	private static WebElement mapOne() {
		return driver.findElement(By.cssSelector("div.col-md-9 a:nth-child(5) img"));
	}
	private static WebElement mapTwo() {
		return driver.findElement(By.cssSelector("div.col-md-9 a:nth-child(7) img"));
	}
	
	// Actions
	
	public void clickMapOne() {
		mapOne().click();
	}
	public void clickMapTwo() {
		mapTwo().click();
	}
}