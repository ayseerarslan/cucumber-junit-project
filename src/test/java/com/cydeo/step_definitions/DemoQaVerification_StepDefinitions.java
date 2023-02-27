package com.cydeo.step_definitions;

import com.cydeo.pages.DemoQa_ElementsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DemoQaVerification_StepDefinitions {

    DemoQa_ElementsPage elementsPage = new DemoQa_ElementsPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("Navigate to {string} page")
    public void navigate_to_page(String string) {
        elementsPage.goToElementPage();

        for (WebElement each : elementsPage.mainMenuButtons) {
            if (each.getText().equalsIgnoreCase(string)) {
                each.click();
            }
        }
    }
    @When("Double click on button")
    public void double_click_on_button() {
        actions.doubleClick(elementsPage.doubleClickMe).perform();
        BrowserUtils.sleep(1);
    }
    @Then("Verify double click text :{string} should be visible")
    public void verify_double_click_text_should_be_visible(String string) {
        Assert.assertTrue(elementsPage.doubleClickMessage.getText().equals(string));
    }
    @Then("Right-click on button")
    public void right_click_on_button() {
        actions.contextClick(elementsPage.rightClickMe).perform();
        BrowserUtils.sleep(1);
    }
    @Then("Verify right click text :{string} should be visible")
    public void verify_right_click_text_should_be_visible(String string) {
        Assert.assertTrue(elementsPage.rightClickMessage.getText().equals(string));
    }
    @Then("Click Me button")
    public void click_me_button() {
        elementsPage.clickMe.click();
        BrowserUtils.sleep(1);
    }
    @Then("Verify click text :{string} should be visible")
    public void verify_click_text_should_be_visible(String string) {
        Assert.assertTrue(elementsPage.clickMessage.getText().equals(string));
    }


}
