package com.kraft.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//span[.='Dashboard']")
    public WebElement dashBoardButton;

    @FindBy(xpath = "//span[.='Components']")
    public WebElement componentsButton;

    @FindBy(xpath = "//span[.='Forms']")
    public WebElement formsButton;

    @FindBy(xpath = "//span[.='JavaScript']")
    public WebElement javaScriptButton;

    @FindBy(xpath = "(//span[.='My Profile'])[2]")
    public WebElement myProfileButton;

}
