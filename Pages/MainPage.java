package zavrsniRad.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

	static WebDriver driver;
	
	public MainPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Elements
	
	private static List<WebElement> topCollections(){
		return driver.findElements(By.cssSelector("div.item-ia.collection-ia"));
	}
	private static WebElement seeMoreLink() {
		return driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div/div[2]/div[3]/div[3]/a"));
	}
	private static WebElement resultNumber() {
		return driver.findElement(By.cssSelector("div.results_count"));
	}
	
	// Actions
	
	public List<WebElement> getTopCollections(){
		return topCollections();
	}
	public void clickOnTopCollectionItem(Integer index) {
		topCollections().get(index).click();
	}
	public void clickSeeMoreLink() {
		seeMoreLink().click();
	}
	public WebElement resultNumbers() {
		 return resultNumber();
		}
}
