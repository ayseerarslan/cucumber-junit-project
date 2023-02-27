package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TryCloud_LoginPage {

    public TryCloud_LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//input[@id='user']")
    public WebElement username;

    @FindBy (css = "input#password")
    public WebElement password;

    public void login(){

        username.sendKeys("User1");
        password.sendKeys("Userpass123"+ Keys.ENTER);
    }
}
