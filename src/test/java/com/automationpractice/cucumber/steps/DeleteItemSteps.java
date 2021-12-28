package com.automationpractice.cucumber.steps;

import com.automationpractice.pages.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DeleteItemSteps {
    @Given("^There is an item already inside my basket$")
    public void thereIsAnItemAlreadyInsideMyBasket() {
        new HomePage().selectMenu("Women");
        new WomenCategoryPage().selectProduct("Faded Short Sleeve T-shirts");
        new ProductPage().clickOnAddToCartBtn();
        new ProductPage().clickOnProceedCheckoutBtn();

    }

    @When("^User clicks on Shopping cart$")
    public void userClicksOnShoppingCart() {
        new TshirtsPage().clickOnCart();
    }

    @And("^User clicks on delete button$")
    public void userClicksOnDeleteButton() {
        new ShoppingCartPage().clickOnDeleteBtn();
    }

    @Then("^User can verify banner message \"([^\"]*)\"$")
    public void userCanVerifyBannerMessage(String expMsg)  {
      new ShoppingCartPage().verifyCartEmptyMsg(expMsg);
    }
}
