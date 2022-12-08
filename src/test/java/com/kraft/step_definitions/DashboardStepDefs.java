package com.kraft.step_definitions;

import com.kraft.pages.BasePage;
import com.kraft.pages.HomePage;
import com.kraft.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class DashboardStepDefs {

    @Then("the user should see the following options")
    public void the_user_should_see_the_following_options(List<String> list) {
        List<String> expectedList = list;
        List<String> actualList = BrowserUtils.getElementsText(new HomePage().menuOptions);
        Assert.assertEquals(expectedList,actualList);
    }

}
