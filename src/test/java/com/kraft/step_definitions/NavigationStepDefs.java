package com.kraft.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationStepDefs {

    @When("navigate to components")
    public void navigate_to_components() {
        //selenium
        System.out.println("go to components");
    }

    @Then("title should be alerts")
    public void title_should_be_alerts() {
        //selenium
        System.out.println("verify the url");
    }

    @When("navigate to forms")
    public void navigate_to_forms() {
        //selenium
        System.out.println("go to forms");
    }

    @Then("title should be inputs")
    public void title_should_be_inputs() {
        //selenium
        System.out.println("verify the url");
    }

    @When("navigate to javascripts")
    public void navigate_to_javascripts() {
        //selenium
        System.out.println("go to js");
    }

    @Then("title should be clicks")
    public void title_should_be_clicks() {
        //selenium
        System.out.println("verify the url");
    }
}
