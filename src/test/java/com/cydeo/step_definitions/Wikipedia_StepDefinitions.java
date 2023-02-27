package com.cydeo.step_definitions;

import com.cydeo.pages.Wikipedia_resultPage;
import com.cydeo.pages.Wikipedia_searchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Wikipedia_StepDefinitions {

    Wikipedia_searchPage wikipedia_searchPage = new Wikipedia_searchPage();
    Wikipedia_resultPage wikipedia_resultPage = new Wikipedia_resultPage();

    @Given("user is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org/");
    }

    @When("user types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String searchKey) {
        wikipedia_searchPage.searchBox.sendKeys(searchKey);
    }

    @Then("user clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikipedia_searchPage.searchButton.click();
    }

    @Given("user sees {string} is in the wiki title")
    public void user_sees_is_in_the_wiki_title(String searchKey) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(searchKey));
    }

    @Given("user sees {string} is in the main header")
    public void userSeesIsInTheMainHeader(String searchKey) {
        String actualHeader = wikipedia_resultPage.mainHeader.getText();
        Assert.assertTrue(actualHeader.equalsIgnoreCase(searchKey));

    }

    @Given("user sees {string} is in the image header")
    public void userSeesIsInTheImageHeader(String searchKey) {

        String actualImageHeader = wikipedia_resultPage.imageHeader.getText();
        Assert.assertTrue(actualImageHeader.equals(searchKey));

    }

}
