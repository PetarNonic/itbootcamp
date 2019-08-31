package zavrsniRad.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BlogPage {

	static WebDriver driver;
	
	public BlogPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Elements
	
	private static WebElement blogLink() {
		return driver.findElement(By.cssSelector("#menu-item-7707"));
	}
	private static WebElement announcementsLink() {
		return driver.findElement(By.cssSelector("#menu-item-3417"));
	}
	private static WebElement internetArchiveStoreLink() {
		return driver.findElement(By.cssSelector("#menu-item-7359"));
	}
	private static WebElement archiveOrgLink() {
		return driver.findElement(By.cssSelector("#menu-item-3422"));
	}
	private static WebElement aboutLink() {
		return driver.findElement(By.cssSelector("#menu-item-3421"));
	}
	private static WebElement eventsLink() {
		return driver.findElement(By.cssSelector("#menu-item-15173"));
	}
	private static WebElement developersLink() {
		return driver.findElement(By.cssSelector("#menu-item-8100"));
	}
	private static WebElement donateLink() {
		return driver.findElement(By.cssSelector("#menu-item-15172"));
	}
	private static WebElement facebookImg() {
		return driver.findElement(By.cssSelector("#archive_sharing_widget-4 a:nth-child(1)"));
	}
	private static WebElement twitterImg() {
		return driver.findElement(By.cssSelector("#archive_sharing_widget-4 a:nth-child(2)"));
	}
	private List<WebElement> archivesDropdown(){
        return driver.findElements(By.name("archive-dropdown"));
    }
	private static WebElement searchField() {
		return driver.findElement(By.cssSelector("#s"));
	}
	private static WebElement searchButton() {
		return driver.findElement(By.cssSelector("#searchsubmit"));
	}
	public static List<WebElement> blogSearchResult() {
        return driver.findElements(By.cssSelector("div#content div.post.type-post.status-publish.format-standard"));
    }
	
	// Actions
	
	public void clickBlogLink() {
		blogLink().click();
	}
	public void clickAnnouncementsLink() {
		announcementsLink().click();
	}
	public void clickIAStoreLink() {
		internetArchiveStoreLink().click();
	}
	public void clickArchiveOrgLink() {
		archiveOrgLink().click();
	}
	public void clickAboutLink() {
		aboutLink().click();
	}
	public void clickEventsLink() {
		eventsLink().click();
	}
	public void clickDevelopersLink() {
		developersLink().click();
	}
	public void clickDonateLink() {
		donateLink().click();
	}
	public void clickFacebookImg() {
		facebookImg().click();
	}
	public void clickTwitterImg() {
		twitterImg().click();
	}
	public void clickSearchField() {
		searchField().click();
	}
	public void sendTextTokSearchField(String searchTerm) {
		searchField().sendKeys(searchTerm);
	}
	public void clickSearchButton() {
		searchButton().click();
	}
	public List<WebElement> getArchivesDropdown(){
		return archivesDropdown();
	}
	public void clickArchivesDropdown(String s) {
		Select drp = new Select((WebElement) archivesDropdown());
		drp.selectByVisibleText(s);
	}
}