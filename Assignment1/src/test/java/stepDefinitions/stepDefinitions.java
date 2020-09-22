package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import resources.base.BaseClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class stepDefinitions {
    public WebDriver driver;

    @Before
    public void base() throws IOException {
        BaseClass bc = new BaseClass();
        driver = bc.baseInit();
        driver.get(bc.p.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Given("I am able to navigate to landing page")
    public void i_am_able_to_navigate_to_landing_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I am able to navigate to landing page");
    }

    @When("I click on SignUp button")
    public void I_click_on_SignUp_button() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.linkText("Sign up!")).click();
    }

    @When("I enter firstname as {string}")
    public void i_enter_firstname_as(String string) {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("I enter lastname as {string}")
    public void i_enter_lastname_as(String string) {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("I enter email as {string}")
    public void i_enter_email_as(String string) {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("I enter username as {string}")
    public void i_enter_username_as(String string) {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("I enter password as {string}")
    public void i_enter_password_as(String string) {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("click on Register button")
    public void click_on_register_button() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("Validate if correct email ID {string} is populated")
    public void validate_if_correct_email_id_is_populated(String string) {
        // Write code here that turns the phrase above into concrete actions

    }

    @After
    public void driverclose() {
        driver.close();
    }

}
