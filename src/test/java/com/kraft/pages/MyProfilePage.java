package com.kraft.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyProfilePage extends BasePage {

    @FindBy(xpath = "(//button[.='Change Password'])[1]")
    public WebElement changePasswordUpTitle;

    @FindBy(xpath = "(//button[.='Change Password'])[2]")
    public WebElement changePasswordButton;



}
