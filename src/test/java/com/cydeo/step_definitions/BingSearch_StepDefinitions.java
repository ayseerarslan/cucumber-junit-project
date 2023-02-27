package com.cydeo.step_definitions;

import com.cydeo.pages.Bing_searchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BingSearch_StepDefinitions {

    Bing_searchPage bing_searchPage = new Bing_searchPage();

    @When("user is on the Bing search page")
    public void user_is_on_the_bing_search_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("bingSearch"));
    }

    @When("user search for {string} in the Bing")
    public void userSearchForInTheBing(String searchKey) {
        bing_searchPage.searchBox.sendKeys(searchKey);
        bing_searchPage.searchBox.sendKeys(Keys.RETURN);
    }

    @Then("user should see {string} in the Bing title")
    public void userShouldSeeInTheBingTitle(String key) {
        String expectedTitle = key + " - Search";
        String actualTitle = Driver.getDriver().getTitle();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleContains(key));


        Assert.assertTrue(expectedTitle.equals(actualTitle));
    }
}
