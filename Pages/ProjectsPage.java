package zavrsniRad.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProjectsPage {

	static WebDriver driver;
	
	public ProjectsPage(WebDriver driver) {
		this.driver=driver;
	}
	
	// Elements
	
	private List<WebElement> projectsList () {
        return driver.findElements(By.cssSelector("div.col-sm-3"));
    }
	
	// Actions
	
	public List<WebElement> getProjectsList() {
		return projectsList();
	}
	public void projectListSize() {
		getProjectsList().size();
	}
}