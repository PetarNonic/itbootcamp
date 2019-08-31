package zavrsniRad.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AboutPage {

	static WebDriver driver;
	
	public AboutPage(WebDriver driver) {
		this.driver = driver;
	}

	// Elements
	
	private static List<WebElement> newsList(){
		return driver.findElements(By.cssSelector("div.forumRow"));
	}
	private static WebElement moreButton() {
		return driver.findElement(By.xpath("/html/body/div/main/div/div/div[1]/div[2]/h1/a"));
	}
	
	// Actions
	
	public List<WebElement> getNewsList(){
		return newsList();
	}
	public void newsListSize(){
		getNewsList().size();
	}
	public void clickMoreButton() {
		moreButton().click();
	}
}