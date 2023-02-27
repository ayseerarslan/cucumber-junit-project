package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DemoQa_ElementsPage {

    public DemoQa_ElementsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='navbar-toggler-icon']")
    public WebElement buttons;

    @FindBy(xpath = "//span[@class='text']")
    public WebElement links;

    @FindBy(xpath = "(//ul[@class='menu-list'])[1]/li")
    public List<WebElement> mainMenuButtons;

    @FindBy(xpath = "//button[@id='doubleClickBtn']")
    public WebElement doubleClickMe;

    @FindBy(xpath = "//button[@id='rightClickBtn']")
    public WebElement rightClickMe;

    @FindBy(xpath = "//button[.='Click Me']")
    public WebElement clickMe;

    @FindBy(xpath = "//p[@id='doubleClickMessage']")
    public WebElement doubleClickMessage;

    @FindBy(xpath = "//p[@id='rightClickMessage']")
    public WebElement rightClickMessage;

    @FindBy(xpath = "//p[@id='dynamicClickMessage']")
    public WebElement clickMessage;

    @FindBy(xpath = "//div[@id='linkWrapper']//a[@href='javascript:void(0)']")
    public List<WebElement> allLinks;

    @FindBy(xpath = "//p[@id='linkResponse']/b[1]")
    public List<WebElement> statusNo;

    @FindBy(xpath = "//p[@id='linkResponse']/b[2]")
    public List<WebElement> linkMessage;

    @FindBy(xpath = "//p[@id='linkResponse']")
    public WebElement linkResponse;

    public void goToElementPage(){
        Driver.getDriver().get("https://demoqa.com/elements");
    }
}
