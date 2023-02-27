package com.cydeo.step_definitions;

import com.cydeo.pages.TryCloud_FilesPage;
import com.cydeo.pages.TryCloud_HomePage;
import com.cydeo.pages.TryCloud_LoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TryCloud_StepDefinitions {

    TryCloud_LoginPage tryCloud_loginPage = new TryCloud_LoginPage();
    TryCloud_HomePage tryCloud_homePage = new TryCloud_HomePage();
    TryCloud_FilesPage tryCloud_filesPage = new TryCloud_FilesPage();


    @Given("user on the login page and enter valid credentials")
    public void user_on_the_login_page_and_enter_valid_credentials() {
        Driver.getDriver().get("https://qa.trycloud.net/");
        tryCloud_loginPage.login();
    }

    @Given("user clicks the Files on the Home page.")
    public void user_clicks_the_files_on_the_home_page() {
        tryCloud_homePage.clickFile();
    }

    @Given("user clicks the Settings in the Files page.")
    public void user_clicks_the_settings_in_the_files_page() {
        tryCloud_filesPage.clickSettings();
    }

    @Then("user should see there are three checkboxes under the Settings.")
    public void user_should_see_there_are_three_checkboxes_under_the_settings() {

        Assert.assertTrue("Fail!", tryCloud_filesPage.showRecommendations.isDisplayed());
        Assert.assertTrue("Fail!", tryCloud_filesPage.showRichWorkspaces.isDisplayed());
        Assert.assertTrue("Fail!", tryCloud_filesPage.showHiddenFiles.isDisplayed());

        Driver.closeDriver();
    }


    @Then("user checks the Show rich workspaces checkbox.")
    public void userChecksTheShowRichWorkspacesCheckbox() {

        BrowserUtils.sleep(2);
        tryCloud_filesPage.showRichWorkspaces.click();
        BrowserUtils.sleep(2);

        Assert.assertTrue(tryCloud_filesPage.showRichWorkspaces.isSelected());

    }

    @Then("user checks the Show recommendations checkbox.")
    public void userChecksTheShowRecommendationsCheckbox() {


    }

    @Then("user checks the Show hidden files checkbox.")
    public void userChecksTheShowHiddenFilesCheckbox() {


    }
}
