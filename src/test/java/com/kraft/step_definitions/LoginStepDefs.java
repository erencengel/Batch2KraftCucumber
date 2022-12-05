package com.kraft.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("user is on login page");
    }

    @When("the user enters the first valid credentials")
    public void the_user_enters_the_first_valid_credentials() {
        System.out.println("provide valid username and password for first user");
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        System.out.println("verify that user successfully login");
    }

    @When("the user enters the second valid credentials")
    public void the_user_enters_the_second_valid_credentials() {
        //selenium
        System.out.println("provide valid username and password for second user");
    }

    @When("the user enters the third valid credentials")
    public void the_user_enters_the_third_valid_credentials() {
        System.out.println("provide valid username and password for third user");
    }

}
