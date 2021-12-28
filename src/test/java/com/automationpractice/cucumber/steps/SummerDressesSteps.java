package com.automationpractice.cucumber.steps;

import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.SummerDressesPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SummerDressesSteps {
    @When("^User clicks on Summer dresses option$")
    public void userClicksOnSummerDressesOption() {
        new HomePage().hoverOnDresses();
        new HomePage().clickOnSummerDressesOption();
    }

    @Then("^User can see the summer dresses page displayed$")
    public void userCanSeeTheSummerDressesPageDisplayed() {
        new SummerDressesPage().verifySummerDressesPage("Summer Dresses");
    }

    @Given("^User is on Summer dresses page$")
    public void userIsOnSummerDressesPage() {
        new HomePage().hoverOnDresses();
        new HomePage().clickOnSummerDressesOption();
    }

    @When("^User selects the price range$")
    public void userSelectsThePriceRange() {
        new SummerDressesPage().selectPriceRange();
    }

    @Then("^User can see the updated results$")
    public void userCanSeeTheUpdatedResults() {
    }
}
