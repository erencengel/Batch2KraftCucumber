package com.kraft.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "email")
    public WebElement usernameInput;

    @FindBy(id = "yourPassword")
    public WebElement passwordInput;

    @FindBy(css = ".btn.btn-primary.w-100")
    public WebElement loginButton;

    public void clickLoginButton(){
        loginButton.click();
    }

    public void login(String username, String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        clickLoginButton();
    }
}
