package com.cydeo.step_definitions;

import com.cydeo.pages.DropdownsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.it.Ma;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DataTables_StepDefinitions {

    @Then("user should see below list")
    public void user_should_see_below_list(List<String> fruitsAndVegetables) {

        System.out.println(fruitsAndVegetables);
        fruitsAndVegetables.get(1);
    }

    @Then("I will share my favorites")
    public void iWillShareMyFavorites(List<String> favPets) {

        System.out.println(favPets);
    }

    @Then("officer is able to see any data he wants")
    public void officerIsAbleToSeeAnyDataHeWants(Map<String, String> data) {

        System.out.println(data.get("name"));
    }

    @Given("user is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get("http://practice.cybertekschool.com/dropdown");
    }

    DropdownsPage dropdownsPage = new DropdownsPage();

    @Then("user should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> expectedMonths) {

        List<String> actualMonths = BrowserUtils.dropdownOptions_as_String(dropdownsPage.monthDropdown);
        Assert.assertEquals(expectedMonths, actualMonths);
    }
}
