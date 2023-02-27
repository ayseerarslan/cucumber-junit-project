package com.cydeo.step_definitions;

import com.cydeo.pages.Google_searchPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleSearch_StepDefinitions {

    Google_searchPage google_searchPage = new Google_searchPage();

    @When("user is on the Google search page")
    public void user_is_on_the_google_search_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("googleSearch"));
    }

    @When("user search for {word} in Google Search")
    public void user_search_for_apple_in_Google_Search(String word) {
        google_searchPage.searchBox.sendKeys(word + Keys.RETURN);

    }

    @Then("user should see {word} in the Google title")
    public void user_should_see_apple_in_the_Google_title(String word) {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = word+ " - Google Search";

        Assert.assertTrue(actualTitle.equals(expectedTitle));
    }

}
