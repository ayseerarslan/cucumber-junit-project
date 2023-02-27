package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TryCloud_HomePage {

    public TryCloud_HomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@href='/index.php/apps/files/']")
    public WebElement fileButton;

    public void clickFile(){
        fileButton.click();
    }

}
