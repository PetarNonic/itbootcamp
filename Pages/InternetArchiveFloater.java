package zavrsniRad.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InternetArchiveFloater {

	static WebDriver driver;
	
	public InternetArchiveFloater(WebDriver driver) {
		this.driver = driver;
	}
	
	// Elements
	
	private static WebElement iaSearchBox() {
		return driver.findElement(By.xpath("//*[@id=\"searchform\"]/div/div[1]/input"));
	}
	private static WebElement iaWebIcon() {
		return driver.findElement(By.cssSelector("div.preamble-whoweare a:nth-child(1)"));
	}
	private static WebElement iaTextsIcon() {
		return driver.findElement(By.cssSelector("div.preamble-whoweare a:nth-child(2)"));
	}
	private static WebElement iaVideoIcon() {
		return driver.findElement(By.cssSelector("div.preamble-whoweare a:nth-child(3)"));
	}
	private static WebElement iaAudioIcon() {
		return driver.findElement(By.cssSelector("div.preamble-whoweare a:nth-child(4)"));
	}
	private static WebElement iaTVIcon() {
		return driver.findElement(By.cssSelector("div.preamble-whoweare a:nth-child(5)"));
	}
	private static WebElement iaSoftwareIcon() {
		return driver.findElement(By.cssSelector("div.preamble-whoweare a:nth-child(6)"));
	}
	private static WebElement iaImageIcon() {
		return driver.findElement(By.cssSelector("div.preamble-whoweare a:nth-child(7)"));
	}
	private static WebElement iaConcertsIcon() {
		return driver.findElement(By.cssSelector("div.preamble-whoweare a:nth-child(8)"));
	}
	private static WebElement iaCollectionsIcon() {
		return driver.findElement(By.cssSelector("div.preamble-whoweare a:nth-child(9)"));
	}
	private static WebElement iaGoButton() {
		return driver.findElement(By.xpath("//*[@id=\"searchform\"]/div/button"));
	}
	private static WebElement iaAdvancedSearchLink() {
		return driver.findElement(By.cssSelector("#search_options > a"));
	}
	private static List<WebElement> numberOfItems() {
		return driver.findElements(By.cssSelector("div:not(micro-label).num-items.topinblock"));
	}
	
	// Actions
	
	public void clickIASearchBox() {
		iaSearchBox().click();
	}
	public void sendTextIASearchBox(String s) {
		iaSearchBox().sendKeys(s);
	}
	public void clickIAWebIcon() {
		iaWebIcon().click();
	}
	public void clickIATextsIcon() {
		iaTextsIcon().click();
	}
	public void clickIAVideoIcon() {
		iaVideoIcon().click();
	}
	public void clickIAAudioIcon() {
		iaAudioIcon().click();
	}
	public void clickIATVIcon() {
		iaTVIcon().click();
	}
	public void clickIASoftwareIcon() {
		iaSoftwareIcon().click();
	}
	public void clickIAImageIcon() {
		iaImageIcon().click();
	}
	public void clickIAConcertsIcon() {
		iaConcertsIcon().click();
	}
	public void clickIACollectionsIcon() {
		iaCollectionsIcon().click();
	}
	public void clickIAGoButton() {
		iaGoButton().click();
	}
	public void clickIaASearchLink() {
		iaAdvancedSearchLink().click();
	}
	public List<WebElement> getNumberOfItems(){
		return numberOfItems();	
	}
}