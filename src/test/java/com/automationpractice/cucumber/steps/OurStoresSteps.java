package com.automationpractice.cucumber.steps;

import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.OurStoresPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OurStoresSteps {
    @Given("^User is on Our Stores page$")
    public void userIsOnOurStoresPage() {
        new HomePage().clickOnOurStoresLink();
    }

    @When("^User can drag the map to see a store from West Palm Beach$")
    public void userCanDragTheMapToSeeAStoreFromWestPalmBeach() {
new OurStoresPage().location();
    }

    @Then("^User can take a screenshot$")
    public void userCanTakeAScreenshot() {
    }
}
