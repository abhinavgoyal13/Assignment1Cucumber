package resources.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {
public WebDriver driver;


    public RegistrationPage(WebDriver driver)
    {
        this.driver= driver;
    }

    By registerMessage= By.xpath("//*[@id=\"cm-content\"]/div/div[2]/div/p[1]");
    public WebElement checkRegistrationMessage()
    {
        return driver.findElement(registerMessage);
    }

    By dropDown = By.xpath("//*[@id=\"navbar\"]/ul[2]/li[2]/a/span[2]");
    public WebElement clickDropDown()
    {
        return driver.findElement(dropDown);
    }

    By checkEmail = By.xpath("//*[@id=\"navbar\"]/ul[2]/li[2]/ul/li[1]/div/p");
    public WebElement checkEmail()
    {
        return  driver.findElement(checkEmail);
    }

    By logOut= By.cssSelector("#logout_button");
    public WebElement logOut()
    {
        return driver.findElement(logOut);
    }
}
