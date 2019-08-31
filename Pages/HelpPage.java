package zavrsniRad.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HelpPage {

	static WebDriver driver;
	
    public HelpPage(WebDriver driver) {
        this.driver = driver;
    }
    
    // Elements
    
    private static WebElement searchBarHelp() {
        return driver.findElement(By.name("query"));
    }
    private List <WebElement> fourButtonsHelp() {
        return driver.findElements(By.cssSelector
                ("body > main > div > section.section.knowledge-base > section.categories.blocks > ul"));
    }
    private static WebElement signInHelp() {
        return driver.findElement(By.partialLinkText("signin"));
    }
    
    // Actions
    
    public List <WebElement> getFourButtonsHelp () {
        return fourButtonsHelp();
    }
    public void clickFourButtonsHelp (Integer index) {
        getFourButtonsHelp().get(index).click();
    }
    public void sendKeysSearchBarHelp (String text) {
        searchBarHelp().sendKeys(text, Keys.ENTER);
    }
    public void clickSignInHelp () {
        signInHelp().click();
    }
}