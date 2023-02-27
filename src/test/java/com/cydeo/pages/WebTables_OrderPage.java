package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WebTables_OrderPage extends WebTable_BasePage{

    public WebTables_OrderPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "product")
    public WebElement productDropdown;

    @FindBy(xpath = "//label[.='Visa']")
    public WebElement visaRadioButton;

    @FindBy(xpath = "//label[.='MasterCard']")
    public WebElement mcRadioButton;

    @FindBy(xpath = "//label[.='American Express']")
    public WebElement aeRadioButton;

    @FindBy(name = "quantity")
    public WebElement quantity;

    @FindBy(xpath = "//button[.='Calculate']")
    public WebElement calcButton;

    @FindBy(name = "name")
    public WebElement customerName;

    @FindBy(name = "street")
    public WebElement street;

    @FindBy(name = "city")
    public WebElement city;

    @FindBy(name = "state")
    public WebElement state;

    @FindBy(name = "zip")
    public WebElement zip;

    @FindBy(name = "cardNo")
    public WebElement cardNo;

    @FindBy(name = "cardExp")
    public WebElement expDate;

    @FindAll({
            @FindBy(xpath = "//label[.='Visa']"),
            @FindBy(xpath = "//label[.='MasterCard']"),
            @FindBy(xpath = "//label[.='American Express']")
    })
    public List<WebElement> cardOptions;

    /*
    ya da FindAll yerine -->
    @FindBy(name = "card")
    public List<WebElement) cardTypes;
     */

    @FindBy(xpath = "//button[.='Process Order']")
    public WebElement processOrderButton;


}
