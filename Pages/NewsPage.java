package zavrsniRad.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewsPage {

	static WebDriver driver;
	
	public NewsPage(WebDriver driver) {
		this.driver=driver;
	}
	
	// Elements
	
	private static WebElement subjectContent() {
	       return driver.findElement(By.cssSelector("div.box.well.well-sm"));
	   }
}