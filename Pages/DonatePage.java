package zavrsniRad.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DonatePage {

	static WebDriver driver;
	
    public DonatePage(WebDriver driver) {
        this.driver = driver;
    }
    
    // Elements
    
    private List<WebElement> donateValue() {
        return driver.findElements(By.cssSelector("ul.donation-radio-list.donationlevel label span.hit-area"));
    }
    private static WebElement donateOtheramount () {
        return driver.findElement(By.cssSelector("input#amount_custom"));
    }
    
    // Actions
    
    public List<WebElement> getDonateValue () {
        return donateValue();
    }
    public void clickDonateValue (Integer index) {
        getDonateValue().get(index).click();
    }
    public void sendKeysDonateOtheramount () {
        donateOtheramount().click();
    }
}