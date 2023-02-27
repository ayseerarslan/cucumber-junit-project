package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TryCloud_FilesPage {

    public TryCloud_FilesPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//button[@data-apps-slide-toggle='#app-settings-content']")
    public WebElement settingsButton;

    @FindBy (xpath = "//input[@id='showRichWorkspacesToggle']")
    public WebElement showRichWorkspaces;

    @FindBy (xpath = "//input[@id='recommendationsEnabledToggle']")
    public WebElement showRecommendations;

    @FindBy (xpath = "//input[@id='showhiddenfilesToggle']")
    public WebElement showHiddenFiles;


    public void clickSettings(){
        settingsButton.click();
    }
}
