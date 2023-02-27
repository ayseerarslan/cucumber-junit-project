package com.cydeo.step_definitions;

import com.cydeo.pages.DemoQa_ElementsPage;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class DemoQaLinkActions_StepDefinitions {

    DemoQa_ElementsPage elementsPage = new DemoQa_ElementsPage();

    @When("the user clicks to {string}")
    public void the_user_clicks_to(String string) {
        for (WebElement each : elementsPage.allLinks) {
            if (each.getText().equalsIgnoreCase(string)){
                each.click();
                BrowserUtils.sleep(1);
                break;
            }
        }

    }
    @Then("the message contains {string}{string}")
    public void the_message_contains(String string, String string2) {

       Assert.assertTrue(elementsPage.linkResponse.getText().contains(string));
       Assert.assertTrue(elementsPage.linkResponse.getText().contains(string2));
    }
}
