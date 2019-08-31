package zavrsniRad.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HiddenSearchPage {
    
    static WebDriver driver;
    
    public HiddenSearchPage (WebDriver driver) {
        this.driver = driver;
    }
    
    // Elements
    
    private List <WebElement> objectText () {
        return driver.findElements(By.cssSelector("#react-wayback-search div.search-result-container.container"));
    }
}