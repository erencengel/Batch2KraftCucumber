package com.kraft.pages;

import com.kraft.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class AmazonBasePage {

    public AmazonBasePage(){
        PageFactory.initElements(Driver.get(),this);
    }

}
