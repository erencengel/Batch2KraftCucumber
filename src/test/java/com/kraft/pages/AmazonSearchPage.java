package com.kraft.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonSearchPage extends AmazonBasePage{

    public AmazonSearchPage(){
        super();
    }

    @FindBy(xpath = "//span[.='Sort by:']")
    public WebElement sortByElement;

    public String getTextOfSortByElement(){
        //return sortByElement.getText();
        String text = sortByElement.getText();
        return text;
    }



}
