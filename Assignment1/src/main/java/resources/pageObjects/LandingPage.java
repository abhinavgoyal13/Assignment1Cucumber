package resources.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import resources.base.BaseClass;

public class LandingPage extends BaseClass {
    public WebDriver driver;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    By linkText = By.linkText("Sign up!");

    public WebElement clickSignUp() {
        return driver.findElement(linkText);
    }
}
