package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import resources.base.BaseClass;
import resources.pageObjects.LandingPage;
import resources.pageObjects.RegistrationPage;
import resources.pageObjects.SignUp;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class stepDefinitions {
    public WebDriver driver;
    public SignUp sp;
    public RegistrationPage rp;
    public static String fullName;
    public static String emailID;

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
        LandingPage lp = new LandingPage(driver);
        lp.clickSignUp().click();
    }

    @When("I enter firstname as {string}")
    public void i_enter_firstname_as(String string) {
        // Write code here that turns the phrase above into concrete actions
        sp = new SignUp(driver);
        sp.editFirstName().sendKeys(string);
        fullName = string;
    }

    @When("I enter lastname as {string}")
    public void i_enter_lastname_as(String string) {
        // Write code here that turns the phrase above into concrete actions
        sp.editlastname().sendKeys(string);
        fullName = fullName + " " + string;
    }

    @When("I enter email as {string}")
    public void i_enter_email_as(String string) {
        // Write code here that turns the phrase above into concrete actions
        sp.editEmail().sendKeys(string);
        emailID = string;
    }

    @When("I enter username as {string}")
    public void i_enter_username_as(String string) {
        // Write code here that turns the phrase above into concrete actions
        Random x= new Random();

        sp.editUsername().sendKeys((string + x.nextInt(10000)));
    }

    @When("I enter password as {string}")
    public void i_enter_password_as(String string) {
        // Write code here that turns the phrase above into concrete actions
        sp.editPassword().sendKeys(string);
        sp.editConfirmPassword().sendKeys(string);
    }

    @Then("click on Register button")
    public void click_on_register_button() {
        // Write code here that turns the phrase above into concrete actions
        sp.clickRegister().click();
    }

    @Then("Validate if correct firstname and last name is populated after registration")
    public void validate_if_correct_firstname_and_last_name_is_populated_after_registration() {
        // Write code here that turns the phrase above into concrete actions
        rp = new RegistrationPage(driver);
        System.out.println(rp.checkRegistrationMessage().getText().toString());
        String actual = rp.checkRegistrationMessage().getText().toString();
        actual = (actual.split(",")[0]).split(" ")[1] + " " + (actual.split(",")[0]).split(" ")[2];
        Assert.assertEquals(fullName, actual);
    }

    @Then("Validate if correct email ID {string} is populated")
    public void validate_if_correct_email_id_is_populated(String string) {
        // Write code here that turns the phrase above into concrete actions

        rp.clickDropDown().click();
        System.out.println(rp.checkEmail().getText().toString());
        Assert.assertEquals(emailID, rp.checkEmail().getText().toString());

    }

    @After
    public void driverclose() {
        rp.logOut().click();
        driver.close();
    }

}
