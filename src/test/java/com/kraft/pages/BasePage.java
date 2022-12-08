package com.kraft.pages;

import com.kraft.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    public void navigateToModule(String name){
        String pathofModule = "//h5[@class='card-title']/a[.='" + name + "']";
        Driver.get().findElement(By.xpath(pathofModule)).click();
    }

    @FindBy(xpath = "//li[@class='nav-item']/a/span")
    public List<WebElement> menuOptions;

}
