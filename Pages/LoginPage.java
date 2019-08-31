package zavrsniRad.Pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	static WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	// Elements
	
	private static WebElement signupLink() {
		return driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div/div/div[2]/section[1]/p/a"));
	}
	private static WebElement emailAdressBox() {
		return driver.findElement(By.name("username"));
	}
	private static WebElement passwordBox() {
		return driver.findElement(By.name("password"));
	}
	private static WebElement forgotPasswordLink() {
        return driver.findElement(By.cssSelector("span.reset-password > a"));
    }
	private static WebElement keepMeLoggedInCheckBox() {
		return driver.findElement(By.cssSelector("div.input-checkbox"));
	}
	private static WebElement loginButton() {
		return driver.findElement(By.name("submit-to-login"));
	}
	private static WebElement errorMessage() {
        return driver.findElement(By.cssSelector(
                "body.navia:nth-child(2) div.container.container-ia div.box.row div.iaform.col-md-8.login-form-section:nth-child(2) section.login-form-element form.iaform.login-form div.password-message:nth-child(5) > span.login-error.password-error"));
    }
	private static WebElement signUpTermsOfConditions() {
        return driver.findElement(By.cssSelector(
                "body.navia:nth-child(2) div.container.container-ia div.box.row div.iaform.col-md-8.signup-form-section:nth-child(2) section.signup-form-element form.iaform.signup-form:nth-child(2) fieldset:nth-child(8) div.terms > a:nth-child(1)"));
    }
	
	// Actions
	
	public void clickSignupLink() {
		signupLink().click();
	}
	public void sendTextToEmailBox(String searchTerm) {
		emailAdressBox().sendKeys(searchTerm);
	}
	public void sendTextToPasswordBox(String searchTerm) {
		passwordBox().sendKeys(searchTerm);
	}
	public void clickLoginButton() {
		loginButton().click();
	}
	public WebElement getLoginButton() {
        return loginButton();
    }
	public WebElement getErrorMessage() {
        return errorMessage();
    }
	public WebElement getForgotPasswordLink() {
        return forgotPasswordLink();
    }
	public void clickOnTermOfConditions() {
        signUpTermsOfConditions().click();
    }
	public void switchToNextWindow() {
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> window = windows.iterator();
        while (window.hasNext()) {
            driver.switchTo().window(window.next());
        }
    }
}