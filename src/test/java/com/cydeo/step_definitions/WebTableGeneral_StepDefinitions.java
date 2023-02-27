package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.pages.WebTable_BasePage;
import com.cydeo.pages.WebTable_ViewAllOrdersPage;
import com.cydeo.pages.WebTables_OrderPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class WebTableGeneral_StepDefinitions {

    WebTables_OrderPage webTables_orderPage = new WebTables_OrderPage();

    @Given("user is already logged in to The Web table app")
    public void user_is_already_logged_in_to_the_web_table_app() {
        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
        WebTableLoginPage webTableLoginPage = new WebTableLoginPage();
        webTableLoginPage.login();
    }
    @When("user is on the Order page")
    public void user_is_on_the_order_page() {
        webTables_orderPage.orderLink.click();
        BrowserUtils.sleep(1);
    }

    @Then("user sees below options under product dropdown")
    public void user_sees_below_options_under_product_dropdown(List<String> expectedOptions) {

        Select select = new Select(webTables_orderPage.productDropdown);

        List<String> actualOptions = new ArrayList<>();

        for (int i = 0; i < select.getOptions().size(); i++) {
            actualOptions.add(select.getOptions().get(i).getText());
        }

        Assert.assertTrue(actualOptions.equals(expectedOptions));

    }

    @Then("user sees Visa as enabled payment option")
    public void userSeesVisaAsEnabledPaymentOption() {
        Assert.assertTrue(webTables_orderPage.visaRadioButton.isDisplayed());
    }

    @Then("user sees MasterCard as enabled payment option")
    public void userSeesMasterCardAsEnabledPaymentOption() {
        Assert.assertTrue(webTables_orderPage.mcRadioButton.isDisplayed());
    }

    @Then("user sees American Express as enabled payment option")
    public void userSeesAmericanExpressAsEnabledPaymentOption() {
        Assert.assertTrue(webTables_orderPage.aeRadioButton.isDisplayed());
    }


    @And("user enters quantity {string}")
    public void userEntersQuantity(String quantity) {
        webTables_orderPage.quantity.clear(); // deleting the existing number
        //webTables_orderPage.quantity.sendKeys(Keys.BACK_SPACE); // deleting the existing number

        webTables_orderPage.quantity.sendKeys(quantity);
    }

    @Then("user clicks to the calculate button")
    public void userClicksToTheCalculateButton() {
        webTables_orderPage.calcButton.click();
    }

    @And("user enters customer name {string}")
    public void userEntersCustomerName(String name) {
        webTables_orderPage.customerName.sendKeys(name);
    }

    @And("user enters street {string}")
    public void userEntersStreet(String street) {
        webTables_orderPage.street.sendKeys(street);
    }

    @And("user enters city {string}")
    public void userEntersCity(String city) {
        webTables_orderPage.city.sendKeys(city);
    }

    @And("user enters state {string}")
    public void userEntersState(String state) {
        webTables_orderPage.state.sendKeys(state);
    }

    @And("user enters zip {string}")
    public void userEntersZip(String zip) {
        webTables_orderPage.zip.sendKeys(zip);
    }

    @And("user selects payment option {string}")
    public void userSelectsPaymentOption(String paymentOption) {

        for (int i = 0; i < webTables_orderPage.cardOptions.size(); i++) {
            if(webTables_orderPage.cardOptions.get(i).getText().equals(paymentOption)){
                webTables_orderPage.cardOptions.get(i).click();
                break;
            }
        }
    }

    @And("user enters credit card number {string}")
    public void userEntersCreditCardNumber(String creditCardNo) {
        webTables_orderPage.cardNo.sendKeys(creditCardNo);
    }

    @And("user enters expiration date {string}")
    public void userEntersExpirationDate(String expDate) {
        webTables_orderPage.expDate.sendKeys(expDate);
    }

    @And("user clicks to process order button")
    public void userClicksToProcessOrderButton() {
        webTables_orderPage.processOrderButton.click();

    }

    WebTable_ViewAllOrdersPage allOrdersPage = new WebTable_ViewAllOrdersPage();
    @Then("user should see {string} in the first row of the web table")
    public void userShouldSeeInTheFirstRowOfTheWebTable(String actualName) {
        Assert.assertTrue(allOrdersPage.newCustomerCell.getText().equals(actualName));

    }
}
