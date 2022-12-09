package com.kraft.step_definitions;

import com.kraft.pages.AmazonHomePage;
import com.kraft.pages.AmazonSearchPage;
import com.kraft.utilities.ConfigurationReader;
import com.kraft.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AmazonStepDefs{

    @Given("the user is on the homepage")
    public void the_user_is_on_the_homepage() {
        Driver.get().get(ConfigurationReader.get("urlamazon"));
    }

    @When("the user enters {string} into the search bar")
    public void the_user_enters_into_the_search_bar(String string) {
        AmazonHomePage amazonHomePage = new AmazonHomePage();
        //amazonHomePage.searchBox.sendKeys(string);
        amazonHomePage.sendTextToSearchButton(string);
    }

    @When("click on the search button")
    public void click_on_the_search_button() {
        AmazonHomePage amazonHomePage = new AmazonHomePage();
        //amazonHomePage.searchButton.click();
        amazonHomePage.clickOnSearchButton();
    }

    @Then("verify that home papge has a sortBy tag")
    public void verify_that_home_papge_has_a_sortBy_tag() {
        String expected = "Sort by:";
        AmazonSearchPage amazonSearchPage = new AmazonSearchPage();
        //String actual = amazonSearchPage.sortByElement.getText();
        String actual = amazonSearchPage.getTextOfSortByElement();
        Assert.assertEquals(expected,actual);
    }

}
