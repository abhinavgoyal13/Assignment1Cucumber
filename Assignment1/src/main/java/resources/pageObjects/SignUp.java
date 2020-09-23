package resources.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SignUp {
public WebDriver driver;


    public SignUp(WebDriver driver)
    {
        this.driver = driver;
    }
    By firstName = By.name("firstname");
    public WebElement editFirstName()
    {
        return driver.findElement(firstName);
    }

    By lastname = By.name("lastname");
    public WebElement editlastname()
    {
        return driver.findElement(lastname);
    }

    By email = By.name("email");
    public WebElement editEmail()
    {
        return driver.findElement(email);
    }

    By username = By.name("username");
    public WebElement editUsername()
    {
        return driver.findElement(username);
    }

    By pass = By.name("pass1");
    public WebElement editPassword()
    {
        return driver.findElement(pass);
    }


    By cfpass = By.name("pass2");
    public WebElement editConfirmPassword()
    {
        return driver.findElement(cfpass);
    }

    By register = By.name("submit");
    public WebElement clickRegister()
    {
        return driver.findElement(register);
    }
}
