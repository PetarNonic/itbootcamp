package zavrsniRad.NavigationMenu;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IconsPart {

	static WebDriver driver;
	
	public IconsPart(WebDriver driver) {
		this.driver = driver;
	}
	
	// Elements
	
	private static WebElement webIcon() {
		return driver.findElement(By.xpath("//*[@id=\"navwrap2\"]/div[2]/ul[1]/li[1]/a"));
	}
	private static WebElement textsIcon() {
		return driver.findElement(By.xpath("//*[@id=\"navwrap2\"]/div[2]/ul[1]/li[2]/a"));
	}
	private static WebElement videoIcon() {
		return driver.findElement(By.xpath("//*[@id=\"navwrap2\"]/div[2]/ul[1]/li[3]/a"));
	}
	private static WebElement audioIcon() {
		return driver.findElement(By.xpath("//*[@id=\"navwrap2\"]/div[2]/ul[1]/li[4]/a"));
	}
	private static WebElement softwareIcon() {
		return driver.findElement(By.xpath("//*[@id=\"navwrap2\"]/div[2]/ul[1]/li[5]/a"));
	}
	private static WebElement imageIcon() {
		return driver.findElement(By.xpath("//*[@id=\"navwrap2\"]/div[2]/ul[1]/li[6]/a"));
	}
	private static WebElement logoIcon() {
		return driver.findElement(By.xpath("//*[@id=\"navwrap2\"]/div[2]/ul[1]/li[7]/a/span[1]"));
	}
	private static WebElement signInIcon() {
		return driver.findElement(By.xpath("//*[@id=\"navwrap2\"]/div[2]/ul[1]/li[10]/a"));
	}
	private static WebElement userNameIcon() {
		return driver.findElement(By.xpath("//*[@id=\"user-menu\"]/span"));
	}
	private static WebElement uploadIcon() {
		return driver.findElement(By.xpath("//*[@id=\"navwrap2\"]/div[2]/ul[1]/li[9]/a"));
	}
	private static WebElement searchBox() {
		return driver.findElement(By.cssSelector("#search-bar-2"));
	}
	
	// Actions
	
	public void clickWebIcon() {
		webIcon().click();
	}
	public void clickTextsIcon() {
		textsIcon().click();
	}
	public void clickVideoIcon() {
		videoIcon().click();
	}
	public void clickAudioIcon() {
		audioIcon().click();
	}
	public void clickSoftwareIcon() {
		softwareIcon().click();
	}
	public void clickImageIcon() {
		imageIcon().click();
	}
	public void clickLogoIcon() {
		logoIcon().click();
	}
	public void clickSignInIcon() {
		signInIcon().click();
	}
	public void clickUserNameIcon() {
		userNameIcon().click();
	}
	public void clickUploadIcon() {
		uploadIcon().click();
	}
	public void clickSearchBox() {
		searchBox().click();
	}
	public void sendTextToSearchBox(String searchTerm) {
		searchBox().sendKeys(searchTerm, Keys.ENTER);
	}
}