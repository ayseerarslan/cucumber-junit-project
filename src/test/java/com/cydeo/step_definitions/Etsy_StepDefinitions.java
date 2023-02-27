package com.cydeo.step_definitions;

import com.cydeo.pages.EtsyPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Etsy_StepDefinitions {

    EtsyPage etsyPage = new EtsyPage();

    @Given("user is on etsy home page")
    public void user_is_on_etsy_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("etsyURL"));
    }

    @Given("user sees title is as expected.")
    public void user_sees_title_is_as_expected() {
        String expected = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        Assert.assertTrue(expected.equals(Driver.getDriver().getTitle()));
    }

    @Given("user types Wooden Spoon in the search box")
    public void user_types_wooden_spoon_in_the_search_box() {
        etsyPage.searchBox.sendKeys("Wooden Spoon");

    }

    @When("user clicks search button")
    public void user_clicks_search_button() {
        //System.out.println("etsyPage.searchButton.isEnabled() = " + etsyPage.searchButton.isEnabled());
        etsyPage.searchButton.click();

    }

    @Then("user sees Wooden Spoon is in the title")
    public void user_sees_wooden_spoon_is_in_the_title() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Wooden spoon"));

    }

    @Given("user types {string} in the search box")
    public void userTypesInTheSearchBox(String searchKey) {
        etsyPage.searchBox.sendKeys(searchKey);
}

    @Then("user sees {string} is in the title")
    public void userSeesIsInTheTitle(String searchKey) {
        String expected = searchKey + " - Etsy";
        Assert.assertTrue(Driver.getDriver().getTitle().equalsIgnoreCase(expected));
    }


}
