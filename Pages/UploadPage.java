package zavrsniRad.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UploadPage {

	static WebDriver driver;
	
	public UploadPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Elements
	
	private static WebElement uploadFiles() {
		return driver.findElement(By.cssSelector("#createhelp > center:nth-child(4) > a"));
	}
	private static WebElement questionMark() {
		return driver.findElement(By.cssSelector("div.iconochive-question-dark"));
	}
	private static WebElement lmaUploader() {
		return driver.findElement(By.cssSelector("div.btn btn-primary"));
	}
}