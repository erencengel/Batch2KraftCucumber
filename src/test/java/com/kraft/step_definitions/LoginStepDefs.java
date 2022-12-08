package com.kraft.step_definitions;

import com.kraft.pages.LoginPage;
import com.kraft.utilities.ConfigurationReader;
import com.kraft.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginStepDefs {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When("the user enters the first valid credentials")
    public void the_user_enters_the_first_valid_credentials() {
        String username = ConfigurationReader.get("validEmail1");
        String password = ConfigurationReader.get("password1");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        String actualTitle = Driver.get().getTitle();
        String expectedTitle = "Dashboard - Kraft Techex Lab - aFm";
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @When("the user enters the second valid credentials")
    public void the_user_enters_the_second_valid_credentials() {
        String username = ConfigurationReader.get("validEmail2");
        String password = ConfigurationReader.get("password2");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);
    }

    @When("the user enters the third valid credentials")
    public void the_user_enters_the_third_valid_credentials() {
        String username = ConfigurationReader.get("validEmail3");
        String password = ConfigurationReader.get("password3");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);
    }

    @When("the user logs in using {string} and {string}")
    public void the_user_logs_in_using_and(String string, String string2) {
        LoginPage loginPage = new LoginPage();
        loginPage.login(string,string2);
    }

    @Then("the user click on {string}")
    public void the_user_click_on(String s) {
        System.out.println("(Integer.parseInt(s) + 2) = " + (Integer.parseInt(s) + 2));
    }

}
