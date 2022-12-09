package com.kraft.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonHomePage extends AmazonBasePage{

    public AmazonHomePage(){
        super();
    }

    @FindBy(css = "#twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(css = "#nav-search-submit-button")
    public WebElement searchButton;

    public void sendTextToSearchButton(String str){
        searchBox.sendKeys(str);
    }

    public void clickOnSearchButton(){
        searchButton.click();
    }


}
