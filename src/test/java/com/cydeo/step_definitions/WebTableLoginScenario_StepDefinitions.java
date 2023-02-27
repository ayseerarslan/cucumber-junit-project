package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class WebTableLoginScenario_StepDefinitions {

    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();
    @Given("user is on the Web Table app login page")
    public void user_is_on_the_web_table_app_login_page() {
        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
    }
    @When("user enters correct username")
    public void user_enters_correct_username() {
        webTableLoginPage.username.sendKeys("Test");
    }
    @When("user enters correct password")
    public void user_enters_correct_password() {
        webTableLoginPage.password.sendKeys("Tester");
    }
    @When("user clicks to login button")
    public void user_clicks_to_login_button() {
        webTableLoginPage.loginButton.click();
    }
    @Then("user should see orders word in the URL")
    public void user_should_see_orders_word_in_the_url() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().endsWith("orders"));
    }

    @When("user enters {string} username and enters {string} password")
    public void userEntersUsernameAndEntersPassword(String username, String password) {
        webTableLoginPage.username.sendKeys(username);
        webTableLoginPage.password.sendKeys(password);
    }

    @When("user enters below correct credentials")
    public void userEntersBelowCorrectCredentials(Map<String, String> credentials) {
        webTableLoginPage.username.sendKeys(credentials.get("username"));
        webTableLoginPage.password.sendKeys(credentials.get("password"));

    }
}
